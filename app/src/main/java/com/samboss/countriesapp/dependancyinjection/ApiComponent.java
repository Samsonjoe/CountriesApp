package com.samboss.countriesapp.dependancyinjection;

import com.samboss.countriesapp.model.CountriesService;
import com.samboss.countriesapp.viewmodel.ListViewModel;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);

    void inject(ListViewModel viewModel);
}
