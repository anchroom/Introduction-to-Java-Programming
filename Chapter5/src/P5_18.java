// 本题很有代表性，我们可以找到多种算法，
// 但直观理解的应该是打印3和4的算法的时候选择的算法，
// 即行列序号的算法都不变，唯一变的是里边显示数字的判定条件，和结果输出的算法，对于结果和行列序号有相关固定算法的可以采用。

public class P5_18 {
    public static void main(String[] args){
        // To print 1
        for(int numberOfLines = 1; numberOfLines<= 6; numberOfLines++){
            for (int numberOfColumns = 1; numberOfColumns <= numberOfLines; numberOfColumns++){
                System.out.print(numberOfColumns + " ");
            }
            System.out.println("");
        }

        // To print 2
        for(int numberOfLines = 1; numberOfLines<= 6; numberOfLines++){
            for (int numberOfColumns = 1; numberOfColumns <= (7-numberOfLines); numberOfColumns++){
                System.out.print(numberOfColumns + " ");
            }
            System.out.println("");
        }

        // To print 3
        for(int numberOfLines = 1; numberOfLines<= 6; numberOfLines++){
            for (int numberOfColumns = 1; numberOfColumns <= 6; numberOfColumns++){
                if ((numberOfColumns + numberOfLines) < 7){
                    System.out.print("  ");
                } else System.out.print((7-numberOfColumns) + " ");
            }
            System.out.println("");
        }

        // To print 4
        for(int numberOfLines = 1; numberOfLines<= 6; numberOfLines++){
            for (int numberOfColumns = 1; numberOfColumns <= 6; numberOfColumns++){
                if (numberOfColumns >= numberOfLines ){
                    System.out.print((7-numberOfColumns) + " ");
                } else System.out.print("  ");
            }
            System.out.println("");
        }
    }

}

