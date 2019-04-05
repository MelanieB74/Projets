package com.formation.control;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.formation.business.HotelService;
import com.formation.domain.Hotel;

@ManagedBean
@RequestScoped
public class HotelController {
	
	@ManagedProperty (value = "#{service}")
	private HotelService hotelService;
	
	private Hotel hotel = new Hotel();
	
	public Hotel getHotel() {
		return hotel;
	}
	
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
	private Hotel selectedHotel;

	public Hotel getSelectedHotel() {
		return selectedHotel;
	}

	public void setSelectedHotel(Hotel selectedHotel) {
		this.selectedHotel = selectedHotel;
	}
	
	public void setHotelService(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	
	//JAPON
		public List<Hotel> getHotelListTokyo() {
			return hotelService.findHotelTokyo();
		}
		
		public List<Hotel> getHotelListOsaka() {
			return hotelService.findHotelOsaka();
		}
		
		public List<Hotel> getHotelListKyoto() {
			return hotelService.findHotelKyoto();
		}
		
		
		public List<Hotel> getHotelsListTokyo() {
			return hotelService.getTokyoH();
		}
		
		public List<Hotel> getHotelsListOsaka() {
			return hotelService.getOsakaH();
		}
		
		public List<Hotel> getHotelsListKyoto() {
			return hotelService.getKyotoH();
		}
	
	
	
	//COREE
		public List<Hotel> getHotelListSeoul() {
			return hotelService.findHotelSeoul();
		}
		
		public List<Hotel> getHotelListBusan() {
			return hotelService.findHotelBusan();
		}
		
		public List<Hotel> getHotelListJeju() {
			return hotelService.findHotelJeju();
		}
		
		
		public List<Hotel> getHotelsListSeoul() {
			return hotelService.getSeoulH();
		}
		
		public List<Hotel> getHotelsListBusan() {
			return hotelService.getBusanH();
		}
		
		public List<Hotel> getHotelsListJeju() {
			return hotelService.getJejuH();
		}
		
		
	//CHINE
		public List<Hotel> getHotelListPekin() {
			return hotelService.findHotelPekin();
		}
				
		public List<Hotel> getHotelListHongKong() {
			return hotelService.findHotelHongKong();
		}
				
		public List<Hotel> getHotelListShangai() {
			return hotelService.findHotelShangai();
		}
					
		public List<Hotel> getHotelsListPekin() {
			return hotelService.getPekinH();
		}
				
		public List<Hotel> getHotelsListHongKong() {
			return hotelService.getHongKongH();
		}
				
		public List<Hotel> getHotelsListShangai() {
			return hotelService.getShangaiH();
		}
	
		
	//THAILANDE
		public List<Hotel> getHotelListBangkok() {
			return hotelService.findHotelBangkok();
		}
				
		public List<Hotel> getHotelListPhuket() {
			return hotelService.findHotelPhuket();
		}
				
		public List<Hotel> getHotelListChiangRai() {
			return hotelService.findHotelChiangRai();
		}
	
		public List<Hotel> getHotelsListBangkok() {
			return hotelService.getBangkokH();
		}
				
		public List<Hotel> getHotelsListPhuket() {
			return hotelService.getPhuketH();
		}
				
		public List<Hotel> getHotelsListChiangRai() {
			return hotelService.getChiangRaiH();
		}
	
}
