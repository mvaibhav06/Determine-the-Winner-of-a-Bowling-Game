public class BowlingGame {
    public int isWinner(int[] player1, int[] player2) {
        int score1 = 0;
        int score2 = 0;

        int len1 = player1.length;
        int len2 = player2.length;

        if(len1>=2){
            score1 = player1[0];
            if(score1 == 10){
                score1 += 2*player1[1];
            }else{
                score1 += player1[1];
            }

            for(int i=2; i<len1; i++){

                if(player1[i-2]==10 || player1[i-1]==10){
                    score1 += 2*player1[i];
                }else{
                    score1 += player1[i];
                }
            }
        }else{
            if(len1 >= 1){
                score1 = player1[0];
                if(len1==2){
                    if(score1 == 10){
                        score1 += 2*player1[1];
                    }else{
                        score1 += player1[1];
                    }
                }
            }
        }


        if(len2>=2){
            score2 = player2[0];
            if(score2 == 10){
                score2 += 2*player2[1];
            }else{
                score2 += player2[1];
            }

            for(int i=2; i<len2; i++){

                if(player2[i-2]==10 || player2[i-1]==10){
                    score2 += 2*player2[i];
                }else{
                    score2 += player2[i];
                }
            }
        }else{
            if(len2 >= 1){
                score2 = player2[0];
                if(len2==2){
                    if(score2 == 10){
                        score2 += 2*player2[1];
                    }else{
                        score2 += player2[1];
                    }
                }
            }
        }

        if(score1==score2){
            return 0;
        }else if(score1 > score2){
            return 1;
        }else{
            return 2;
        }
    }
}
