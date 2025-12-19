package abstract1;

    abstract class Teacher{
        public abstract void work();
    }
    class  MathTeacher extends Teacher{
        @ Override
        public void work(){
            System.out.println("我在上数学课");
        }
    }
    class ChineseTeacher extends Teacher{
        @ Override
        public void work(){
            System.out.println("我在上语文课");
        }
    }
