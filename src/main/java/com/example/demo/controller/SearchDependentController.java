package com.example.demo.controller;

import com.example.demo.model.Dependent;
import com.example.demo.model.Search;
import com.example.demo.model.Update;
import com.example.demo.service.SearchService;
import com.example.demo.service.ShowDependentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.constraints.Null;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
public class SearchDependentController {
    private SearchService searchService = new SearchService();
    private ShowDependentService showDependentService = new ShowDependentService();

    @PostMapping("/search/dependent")
    private String search(Model model, @ModelAttribute Update update){

        //log.info(update.getSsn().toString());
        if (update.getSsn().isEmpty()) {
                return "/jsp/noDependent.jsp";

        }
        Map<String, String> params = new HashMap<String, String>();
        params.put("mainCategory","none");
        params.put("inputText","");
        params.put("name","1");
        params.put("ssn","1");
        params.put("bdate","1");
        params.put("address","1");
        params.put("sex","1");
        params.put("salary","1");
        params.put("supervisor","1");
        params.put("department","1");

        ArrayList<Search> searches = searchService.search(params);
        ArrayList<Dependent> searches_2 = showDependentService.getDependentInfo(update.getSsn());

        for(int i=0; i < searches_2.size(); i++){
            for(int j=0; j < searches.size(); j++){
                if(searches.get(j).getSsn().equals(searches_2.get(i).getParent_name())){
                    log.info("set name");
                    searches_2.get(i).setParent_name(searches.get(j).getName());
                }
            }
        }

        model.addAttribute("check", searchService.getCheck());
        model.addAttribute("tableHeaders", searchService.getHeader());
        model.addAttribute("searches", searches);
        model.addAttribute("tableChild", searches_2);

        //추가입력
        //boolean search = ShowDependentService.search()
                ///

        return "/jsp/search.jsp";
    }
}
