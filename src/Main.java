//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        String customerName = "김현수";
        int price = 1500;
        int quantity  = 6;
        boolean isMember = false;

        // 미션 A
        int total = price * quantity;

        // 미션 B
        boolean isDiscountTarget = isMember || quantity >= 5;
        if (isDiscountTarget) {
            total -= (int) (total * 0.1);
        }

        int points = (int) (total * 0.05);
        boolean isEligibleForGift = points >= 100;

        // 미션 D
        int change = cash - total;
        System.out.println("" +
                customerName + "님의 영수증\n" +
                "총 결제금액: " + total +"\n"+
                "적립 포인트: " + points + "점\n"+
                "사은품 대상: " + isEligibleForGift +"\n"+
                "거스름돈: "+ change);

 

    }
}