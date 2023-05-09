
public class Buy_and_sell_stock {

	public static int BuyAndsellStocks(int price[])
	{
		int buyprice=Integer.MAX_VALUE;
		int maxprofit=0;
		
		for(int i=0;i<price.length;i++)
		{
			if(buyprice<price[i]) {
				int profit=price[i]-buyprice;
				maxprofit=Math.max(maxprofit, profit);
			}
			else {
				buyprice=price[i];
			}
		}
		return maxprofit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int price[]= {7,1,5,4,6,3};
		System.out.println(BuyAndsellStocks(price)); 
	}

}
