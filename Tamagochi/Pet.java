public class Pet {
    public String name;
    public int energy;
    public int mood=50;

    public Pet(String name, int energy) {
        this.name = name;
        this.energy = energy;
    }

    public String showStatus() {
        return "Имя: " + name + "\nЭнергия: " + energy + "\nНастроение: " + mood;
    }

    public void play() {
        if (energy<10) {
            System.out.println(name + "слишком устал(-а), чтобы поиграть с тобой");
            return;
        }
        energy -=10;
        mood += 5;
        if (mood>100) {
            mood = 100;
        }
    }
    public void rest() {
        energy += 20;
        if (energy>100) {
            energy = 100;
        }
    }
    public void giveTreat() {
        mood += 10;
        if (mood>100) {
            mood = 100;
        }
    }
//    public void exitGame() {
//        break;
//    }
}