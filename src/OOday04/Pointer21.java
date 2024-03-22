package OOday04;

    import java.util.Scanner;

    public class Pointer21 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("欢迎来到21点游戏！");

            while (true) {
                playRound(scanner);
                System.out.print("是否继续游戏？(y/n): ");
                String continuePlaying = scanner.next();
                if (!continuePlaying.equalsIgnoreCase("y")) {
                    break;
                }
            }

            System.out.println("感谢您的参与，再见！");
            scanner.close();
        }

        public static void playRound(Scanner scanner) {
            int playerTotal = 0;
            int computerTotal = 0;

            // 玩家和电脑各抽两张牌
            playerTotal += drawCard();
            playerTotal += drawCard();
            computerTotal += drawCard();
            computerTotal += drawCard();

            System.out.println("您的牌面总点数为: " + playerTotal);

            // 玩家回合
            while (true) {
                System.out.print("是否继续抽牌？(y/n): ");
                String continueDrawing = scanner.next();
                if (!continueDrawing.equalsIgnoreCase("y")) {
                    break;
                }
                playerTotal += drawCard();
                System.out.println("您的牌面总点数为: " + playerTotal);
                if (playerTotal > 21) {
                    System.out.println("您爆了！电脑获胜！");
                    return;
                }
            }

            // 电脑回合
            while (computerTotal < 17) {
                computerTotal += drawCard();
            }

            System.out.println("电脑的牌面总点数为: " + computerTotal);

            // 判断胜负
            if (computerTotal > 21 || playerTotal > computerTotal) {
                System.out.println("恭喜！您获胜了！");
            } else if (playerTotal < computerTotal) {
                System.out.println("很遗憾，您输了！");
            } else {
                System.out.println("平局！");
            }
        }

        public static int drawCard() {
            // 生成1-11之间的随机数，模拟抽牌
            return (int) (Math.random() * 11) + 1;
        }
    }

