package com.web_dev_494.uGraduate.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.web_dev_494.uGraduate.dao.SectionDAO;
import com.web_dev_494.uGraduate.entity.Section;

@Service 
public class SectionServiceFunctionality implements SectionService {
	
	SectionDAO sectionDAO;
	
	
	    @Autowired
	    public SectionServiceFunctionality(SectionDAO sectionDAO){
	        this.sectionDAO = sectionDAO;
	    }
/*

	    @Override
	    @Transactional
	    public Section find(int CRN){
	        return sectionDAO.find(CRN);
	    }
*/

	    @Override
	    public void addSection(Section s) {
	        sectionDAO.addSection(s);
	    }
/*
	    @Override
	    @Transactional
	    public void deleteSection(int CRN) {
	        sectionDAO.deleteSection(CRN);
	    }*/
}
