     int full=numb;
        int empty=numb;
        while(empty>=nume){
            int newbottle=empty/nume;
            full+=newbottle;
            empty=newbottle+(empty%nume);
            nume++;

        }
        return ful