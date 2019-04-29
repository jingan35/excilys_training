package com.excilys.cdb.service;
import java.sql.Timestamp;
import java.util.ArrayList;

import com.excilys.cdb.mapper.DtoCompany;
import com.excilys.cdb.mapper.DtoCompany;
import com.excilys.cdb.model.*;
import com.excilys.cdb.persistance.DaoCompany;

public class ServiceCompany {
	private ServiceCompany()
    {}
	DaoCompany dC = DaoCompany.getInstance();
    /** Instance unique pré-initialisée */
    private static ServiceCompany INSTANCE = new ServiceCompany();
     
    /** Point d'accès pour l'instance unique du singleton */
    public static ServiceCompany getInstance()
    {   return INSTANCE;
    }
	
			
			public ArrayList<DtoCompany> selectCompany(int nbRowByPage,int page){
				
		  		//le liste renvoyée
		  		ArrayList<DtoCompany> resultList = new ArrayList<DtoCompany>();
		  		ArrayList<ModelCompany> list= dC.select(nbRowByPage,page);
		  		for(int i=0;i<list.size();i++) {
		  			resultList.add(MapperCompany.modelCompanyToDtoCompany(list.get(i)));
		  		}
				return resultList;
				
			}
	
}