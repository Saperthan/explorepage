package com.saperthan.spring.explorepage.service;

import com.saperthan.spring.explorepage.repository.TourPackageRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class TourPackageService {
    private TourPackageRepository tourPackageRepository;

    @Autowired

    public TourPackageService(TourPackageRepository tourPackageRepository) {
        this.tourPackageRepository = tourPackageRepository;
    }


}
