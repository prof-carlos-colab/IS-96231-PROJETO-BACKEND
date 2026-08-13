package com.example.helpdesk.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Marketing {
    @RequestMapping("/marketing")
    public String setorMarketing() {
        return "Marketing";
    }

    @RequestMapping("/financeiro")
    public String setorFinanceiro() {
        return "Financeiro";
    }

    @RequestMapping("/vendas")
    public String setorVendas() {
        return "Vendas";
    }
}
