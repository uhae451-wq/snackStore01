//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        String customerName = "김현수";
        int price = 15000;
        int quantity  = 6;
        boolean isMember = false;
        int cash = 10000;

        // 미션 A
        int total = price * quantity;

        // 미션 B
        boolean isDiscountTarget = isMember || quantity >= 5;
        if (isDiscountTarget) {
            total -= (int) (total * 0.1);
        }

    }
}