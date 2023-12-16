import java.util.Scanner;
public class Yeni{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Aylık kazancınızı giriniz");
        int a=scanner.nextInt();
        System.out.println("Aylık harcamanızı giriniz");
        int b=scanner.nextInt();
        int c=(a-b);
        int d=0;
        if (a>b){
            if (b>d){
                System.out.println("En azından cebinde kalan para gene borçlarından fazla yani bu da bir şey sanırım");
                System.out.println("Kalan paraya bakmak istersin belki:" + c);
            }
            else if (b==d){
                 System.out.println("Orospu çocuğu mağarada yaşıyorsun heralde");
                 System.out.println("Harcamıyorsun ama gene de göstereyim ben:" + c);
            }
        }
        else if (a<b){
            if (a>d){
                System.out.println("Amına koyiyim git borç morç iste bu ne");
                System.out.println("Para kalmadı ki amk gene de ne kadar borç istemen gerektiğine bak:" + c);
            }
            else if (a==d){
                System.out.println("Ya cocuksun ya da evlilik programları izlerken anasından azar yiyen 40 yaşındaki eleman sensin");
                System.out.println("Annen için hayal kırıklığısın");
            }
            }
        else{
            System.out.println("para kalmadı ki amq çöpten yicen bu ay");
            System.out.println("yoq");
        }
        }
        }
    
