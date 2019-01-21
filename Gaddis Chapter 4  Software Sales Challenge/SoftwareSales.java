package chapter4;
/* Jenny Jo Beushausen
* Chapter 4 
* Programming Challenge 4
* Software Sales Class 
*/

/* 
 * This class is used to calculate the final cost of a 
 * software purchase.
 */

// define variables in the SoftwareSales class.
public class SoftwareSales 
{	
	private double 
	baseCost,
    discount,
    discountRate,
    cost;
	
    private int
	unitsSold;
	

/** 
* The constructor uses the "u" parameter to accept an argument. 
* The value in u is assigned to unitsSold.
* The calculateCost method is called.
*/
public SoftwareSales(int u)
{
	unitsSold=u;
	calculateCost();
}

/**
* The setDiscountRate method sets the rate of the discount,
* based on the number of units purchased. 
*/
private void setDiscountRate()
{	
	if (unitsSold<9)
	discountRate=0.0;
	else if (unitsSold<20)
	discountRate=0.2;
	else if (unitsSold<50)
	discountRate = 0.3;
	else if (unitsSold<100)
	discountRate=0.4;
	else
	discountRate=0.5;
}

/**
* The calculateCost method calculates the 
* final cost of the sale after the appropriate
* discount is applied, based on units purchased.
*/
private void calculateCost()
{
	setDiscountRate();
	double unitCost=99.00;
	baseCost=unitsSold*unitCost;
	discount=baseCost*discountRate;
	cost=baseCost-discount;
}


//The getBaseCost method returns baseCost.
public double getBaseCost()
{
	return baseCost;
}

//The getDiscout method returns getDiscount.
public double getDiscount()
{
	return discount;
}

//The getUnitsSold method returns unitsSold.
public int getUnitsSold()
{
	return unitsSold;
}

//The getCost method returns cost.
public double getCost()
{
	return cost;
}


}
