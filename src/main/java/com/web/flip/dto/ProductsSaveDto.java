package com.web.flip.dto;

public class ProductsSaveDto {
	
	

	private String product;
	
	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getSellingprice() {
		return sellingprice;
	}

	public void setSellingprice(String sellingprice) {
		this.sellingprice = sellingprice;
	}

	public String getOrginalprice() {
		return orginalprice;
	}

	public void setOrginalprice(String orginalprice) {
		this.orginalprice = orginalprice;
	}

	public String getDescripition() {
		return descripition;
	}

	public void setDescripition(String descripition) {
		this.descripition = descripition;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public String getCamera() {
		return camera;
	}

	public void setCamera(String camera) {
		this.camera = camera;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getProccessor() {
		return proccessor;
	}

	public void setProccessor(String proccessor) {
		this.proccessor = proccessor;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Long getReviews() {
		return reviews;
	}

	public void setReviews(Long reviews) {
		this.reviews = reviews;
	}

	private String sellingprice;
	
	private String orginalprice;
	
	private String descripition;
	
	private String display;
	
	private String camera;
	
	private String battery;
	
	public ProductsSaveDto(String product, String sellingprice, String orginalprice, String descripition,
			String display, String camera, String battery, String proccessor, String url, float rating, Long reviews) {
		super();
		this.product = product;
		this.sellingprice = sellingprice;
		this.orginalprice = orginalprice;
		this.descripition = descripition;
		this.display = display;
		this.camera = camera;
		this.battery = battery;
		this.proccessor = proccessor;
		this.url = url;
		this.rating = rating;
		this.reviews = reviews;
	}

	private String proccessor;
	
	private String url;
	
	private float rating;
	
	private Long reviews;
	
	
	
	
//    private String name;
//	
//    private String imgurl;
//	public String getImgurl() {
//		return imgurl;
//	}
//
//	public void setImgurl(String imgurl) {
//		this.imgurl = imgurl;
//	}
//
//	public ProductsSaveDto(String name,String imgurl, String description, double sellingprice, double originalprice,
//			String company) {
//		super();
//		this.name = name;
//		this.imgurl=imgurl;
//		this.description = description;
//		this.sellingprice = sellingprice;
//		this.originalprice = originalprice;
//		this.company = company;
//		
//	}
//
//	private String description;
//	
//	private double sellingprice;
//	
//	private double originalprice;
//	
//	private String company;
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public double getSellingprice() {
//		return sellingprice;
//	}
//
//	public void setSellingprice(double sellingprice) {
//		this.sellingprice = sellingprice;
//	}
//
//	public double getOriginalprice() {
//		return originalprice;
//	}
//
//	public void setOriginalprice(double originalprice) {
//		this.originalprice = originalprice;
//	}
//
//	public String getCompany() {
//		return company;
//	}
//
//	public void setCompany(String company) {
//		this.company = company;
//	}

}
