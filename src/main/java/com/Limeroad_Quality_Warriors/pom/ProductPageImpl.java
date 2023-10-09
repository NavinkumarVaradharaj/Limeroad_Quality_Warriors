package com.Limeroad_Quality_Warriors.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPageImpl {

	PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="women_category")
	private WebElement Women_category;
	

	public WebElement getWomen_category() {
		return Women_category;
	}

	public WebElement getFilp_Flops() {
		return Filp_Flops;
	}

	public WebElement getWomenToeSlipper() {
		return WomenToeSlipper;
	}

	@FindBy(xpath="//a[text()='flip flops']")
	private WebElement Filp_Flops;
	
	@FindBy(css ="div#zero_result>div:nth-of-type(3)")
	private WebElement WomenToeSlipper;
	
	
}
}
