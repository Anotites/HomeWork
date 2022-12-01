package additional.objects.computer;

public class Computer {

    PowerSupply powerSupply;
    HardDrive hardDrive;
    RAM ram;
    Processor processor;
    VideoCard videoCard;

    public Computer() {
        this.powerSupply = new PowerSupply();
        this.hardDrive = new HardDrive();
        this.ram = new RAM();
        this.processor = new Processor();
        this.videoCard = new VideoCard();
    }

    /**
     * Метод, который проверяет все компоненты, существуют ли они, и выводит вывод, включился ли
     * компьютер.
     *
     * @return Вывод, включился ли компьютер.
     */
    public String turningOnTheComputer() {
        String result = "Computer did not turn on";
        if (powerSupply.isExist() && hardDrive.isExist() && ram.isExist()
                && processor.isExist() && videoCard.isExist()) {
            result = "Computer turned on";
        }
        return result;
    }
}
