package com.samevian.service;

import com.samevian.model.Organ;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class OrganService {
    private final List<Organ> organs = new ArrayList<>();
    
    public OrganService() {
        organs.add(new Organ("varpet","Վարպետ","Master","CORE",List.of("hands","eyes")));
        organs.add(new Organ("sharzhich","Շարժիչ","Engine","CORE",List.of("wheels","motor")));
        organs.add(new Organ("uxegh","Ուղեղ","Brain","CORE",List.of("memory","logic")));
        organs.add(new Organ("sirt","Սիրտ","Heart","CORE",List.of("pulse","emotion")));
        organs.add(new Organ("dzayn","Ձայն","Voice","SECONDARY",List.of("speaker","mic")));
        organs.add(new Organ("tesoghuthyun","Տեսողություն","Vision","SECONDARY",List.of("camera","lens")));
        organs.add(new Organ("lsoxuthyun","Լսողություն","Hearing","SECONDARY",List.of("ears","audio")));
        organs.add(new Organ("hasaneliuthyun","Հասանելիություն","Accessibility","SECONDARY",List.of("ramps","voice")));
        organs.add(new Organ("evokatsia","Էվոկացիա","Evocation","NICE",List.of()));
        organs.add(new Organ("zhamanak","Ժամանակ","Time","NICE",List.of()));
        organs.add(new Organ("taratsq","Տարածք","Space","NICE",List.of()));
        organs.add(new Organ("hishoghuthyun","Հիշողություն","Memory","NICE",List.of()));
        organs.add(new Organ("hamakarg","Համակարգ","System","ONLINE",List.of()));
        organs.add(new Organ("kaghak","Քաղաք","City","ONLINE",List.of()));
        organs.add(new Organ("ashkharh","Աշխարհ","World","ONLINE",List.of()));
        organs.add(new Organ("tiezerk","Տիեզերք","Universe","ONLINE",List.of()));
    }
    
    public List<Organ> getAll() { return organs; }
    public List<Organ> getByLevel(String level) {
        return organs.stream().filter(o -> o.getCategory().equalsIgnoreCase(level)).toList();
    }
}