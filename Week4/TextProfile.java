public class TextProfile {

    
    static class Profile {
        private String name;
        private int age;
        private double heightMetres;
        public Profile(String name, int age, double heightMetres) {
            this.name = name;
            this.age = age;
            this.heightMetres = heightMetres;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public double getHeightMetres() {
            return heightMetres;
        }
        public String toString() {
            return "Profile[name=" + name + 
                   ", age=" + age + 
                   ", height=" + heightMetres + "m]";
        }
    }

}
