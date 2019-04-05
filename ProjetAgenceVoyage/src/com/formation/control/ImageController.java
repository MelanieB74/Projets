package com.formation.control;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class ImageController {
	
	//IMAGES DU CAROUSSEL
	private List<String> imagesJap;
	private List<String> imagesCor;
	private List<String> imagesChi;
	private List<String> imagesTha;
	
	//IMAGES DES HOTELS
	private List<String> imagesHotJap;
	private List<String> imagesHotCor;
	private List<String> imagesHotChi;
	private List<String> imagesHotTha;
	
	
    
    @PostConstruct
    public void init() {
   //BOUCLES POUR SELECTIONNER LES IMAGES DES PAYS CORRESPONDANTS POUR LE CARROUSEL 
        imagesJap = new ArrayList<String>();
	        for (int i = 1; i <= 8; i++) {
	            imagesJap.add("jap" + i + ".jpg");
	        }
        
        imagesCor = new ArrayList<String>();
	        for (int i = 1; i <= 8; i++) {
	            imagesCor.add("cor" + i + ".jpg");
	        }
        
        imagesChi = new ArrayList<String>();
	        for (int i = 1; i <= 8; i++) {
	            imagesChi.add("ch" + i + ".jpg");
	        }
        
        imagesTha = new ArrayList<String>();
	        for (int i = 1; i <= 8; i++) {
	            imagesTha.add("tha" + i + ".jpg");
	        }
        
     //BOUCLES POUR SELECTIONNER LES IMAGES DES HOTELS CORRESPONDANTS  
     int j=0; j++;
        switch (j) {
	        case (1) :
	        	imagesHotJap = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotJap.add("hotelJ" + i + ".JPG");
		        	}
	        	
	        	imagesHotCor = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotCor.add("hotelC" + i + ".JPG");
		        	}
		        
		        imagesHotChi = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotChi.add("hotelCH" + i + ".JPG");
		        	}
		        
		        imagesHotTha = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotTha.add("hotelT" + i + ".JPG");
		        	}
		        	
	      
	        case (2) :
	        	imagesHotJap = new ArrayList<String>();  
			        for (int i = 1; i <= 4; i++) {
			        	imagesHotJap.add("hotelJ" + i + ".JPG");
	    			}

			    imagesHotCor = new ArrayList<String>();  
			        for (int i = 1; i <= 4; i++) {
			        	imagesHotCor.add("hotelC" + i + ".JPG");
	    			}
			        
			    imagesHotChi = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotChi.add("hotelCH" + i + ".JPG");
		        	}
		        	
		        imagesHotTha = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotTha.add("hotelT" + i + ".JPG");
		        	}
		        	
	  
	        case (3) :
	        	imagesHotJap = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotJap.add("hotelJ" + i + ".JPG");
		        	}
	        	
	        	imagesHotCor = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotCor.add("hotelC" + i + ".JPG");
		        	}
	        	
	        	imagesHotChi = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotChi.add("hotelCH" + i + ".JPG");
		        	}
		        			        	
		        imagesHotTha = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotTha.add("hotelT" + i + ".JPG");
		        	}
		        	
	      
	        case (4) :
	        	imagesHotJap = new ArrayList<String>();  
			        for (int i = 1; i <= 4; i++) {
			        imagesHotJap.add("hotelJ" + i + ".JPG");
	    			}
			        
			    imagesHotCor = new ArrayList<String>();  
			        for (int i = 1; i <= 4; i++) {
			        imagesHotCor.add("hotelC" + i + ".JPG");
	    			}
			        
			    imagesHotChi = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotChi.add("hotelCH" + i + ".JPG");
		        	}
		        	
		        imagesHotTha = new ArrayList<String>();  
		        	for (int i = 1; i <= 4; i++) {
		        		imagesHotTha.add("hotelT" + i + ".JPG");
		        	}
	    }

    }   
 
    public List<String> getImagesJap() {
        return imagesJap;
    }
    
    public List<String> getImagesCor() {
        return imagesCor;
    }
    
    public List<String> getImagesChi() {
        return imagesChi;
    }
    
    public List<String> getImagesTha() {
        return imagesTha;
    }
    
    
    public List<String> getImagesHotJap() {
        return imagesHotJap;
    }
    
    public List<String> getImagesHotCor() {
        return imagesHotCor;
    }
    
    public List<String> getImagesHotChi() {
        return imagesHotChi;
    }
    
    public List<String> getImagesHotTha() {
        return imagesHotTha;
    }

}
