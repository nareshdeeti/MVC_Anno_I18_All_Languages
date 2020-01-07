package com.t7.service;

import org.springframework.stereotype.Service;

import java.util.Locale;

@Service("lServic")
public class LanguagesServiceImpl implements LanguageService {
    @Override
    public Locale[] allLanguages() {
        Locale locale[]=Locale.getAvailableLocales();
        return locale;
    }
}
