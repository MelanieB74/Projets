package com.formation.business;

import java.util.List;

import com.formation.domain.Hotel;

public interface HotelService {
	
	//JAPON
	public List<Hotel> findHotelTokyo();
	public List<Hotel> findHotelOsaka();
	public List<Hotel> findHotelKyoto();

	public List<Hotel> getTokyoH();
	public List<Hotel> getOsakaH();
	public List<Hotel> getKyotoH();
	
	//COREE
	public List<Hotel> findHotelSeoul();
	public List<Hotel> findHotelBusan();
	public List<Hotel> findHotelJeju();

	public List<Hotel> getSeoulH();
	public List<Hotel> getBusanH();
	public List<Hotel> getJejuH();
	
	//CHINE
	public List<Hotel> findHotelPekin();
	public List<Hotel> findHotelHongKong();
	public List<Hotel> findHotelShangai();

	public List<Hotel> getPekinH();
	public List<Hotel> getHongKongH();
	public List<Hotel> getShangaiH();
	
	//THAILANDE
	public List<Hotel> findHotelBangkok();
	public List<Hotel> findHotelPhuket();
	public List<Hotel> findHotelChiangRai();

	public List<Hotel> getBangkokH();
	public List<Hotel> getPhuketH();
	public List<Hotel> getChiangRaiH();

}
