package ru.skillfactorydemo.tgbot.controllers;

import lombok.*;
import org.springframework.web.bind.annotation.*;
import ru.skillfactorydemo.tgbot.dto.ValuteCursOnDate;
import ru.skillfactorydemo.tgbot.service.CentralRussianBankService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

    private final CentralRussianBankService centralRussianBankService;

    @GetMapping("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }
}