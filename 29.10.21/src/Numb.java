public class Numb<T extends Number>{

        private T num;

        public Numb(T num){
            this.num=num;
        }
        public void setNum(T num) {
            this.num = num;
        }

        public int intNum(){
            return num.intValue();
        }

        public double doubleNum(){
            return num.doubleValue();
        }

        public short shortNum(){
            return num.shortValue();
        }

        public long longNum(){
            return num.longValue();
        }

        public float floatNum(){
            return num.floatValue();
        }

        public String stringNum(){
            return num.toString();
        }

    }
