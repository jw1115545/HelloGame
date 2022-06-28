import java.util.Scanner;

public class PlayEvent {

    private int num;
    private int damage;

    public void event1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("파트너 포켓몬을 선택하세요.");
        System.out.println("1. 파이리 / 2. 꼬부기 / 3. 이상해씨");
        System.out.print("선택 : ");
        num = sc.nextInt();


    }
    public void event2(){
        Pocketmon p = new Pocketmon();
        if(num == 1){
            p.fire();
            System.out.println("파이리를 선택 했습니다.");
            System.out.println("---------------------");
        } else if (num==2) {
            p.water();
            System.out.println("꼬부기를 선택 했습니다.");
            System.out.println("---------------------");
        } else if (num ==3) {
            p.leaf();
            System.out.println("이상해씨를 선택 했습니다.");
            System.out.println("---------------------");
        }
    }
    public void event3(){
        int hp = 200;
        Scanner sc = new Scanner(System.in);
        System.out.println("야생의 몬스터를 만났다!");
        System.out.println("체력 : "+hp);
        System.out.println("1. 기본공격 / 2. 기술사용 / 3. 회복");
        System.out.print("선택 : ");
        num = sc.nextInt();
        System.out.println("---------------------");
    }
    public void attack(){
        damage = 20;
        System.out.printf("기본공격으로 데미지 %을 입혔습니다.",damage);

    }
}


