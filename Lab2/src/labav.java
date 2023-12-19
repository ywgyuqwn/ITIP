 // Абстрактный класс Приложение
    abstract class Application {
        private String name;
        private String version;
        private String developer;

        public Application(String name, String version, String developer) {
            this.name = name;
            this.version = version;
            this.developer = developer;
        }

        // Геттеры и сеттеры
        public String getName() {
            return name;
        }
        public String getVersion() {
            return version;
        }
        public String getDeveloper() {
            return developer;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setVersion(String version) {
            this.version = version;
        }
        public void setDeveloper(String developer) {
            this.developer = developer;
        }

        // Абстрактные методы для описания поведения приложения
        public abstract void run();

        public abstract void displayInfo();
    }

    // Класс Социальная сеть, наследуется от Приложение
    class SocialNetwork extends Application {
        private int numberOfUsers;
        private String platform;

        public SocialNetwork(String name, String version, String developer, int numberOfUsers, String platform) {
            super(name, version, developer);
            this.numberOfUsers = numberOfUsers;
            this.platform = platform;
        }

        public int getNumberOfUsers() {
            return numberOfUsers;
        }

        public String getPlatform() {
            return platform;
        }

        public void setNumberOfUsers(int numberOfUsers) {
            this.numberOfUsers = numberOfUsers;
        }

        public void setPlatform(String platform) {
            this.platform = platform;
        }

        @Override
        public void run() {
            System.out.println(getName() + " is running.");
        }

        @Override
        public void displayInfo() {
            System.out.println("Application Name: " + getName());
            System.out.println("Version: " + getVersion());
            System.out.println("Developer: " + getDeveloper());
            System.out.println("Number of Users: " + numberOfUsers);
            System.out.println("Platform: " + platform);
        }
    }

    // Класс Игра, наследуется от Приложение
    class Game extends Application {
        private String genre;
        private int numberOfPlayers;

        public Game(String name, String version, String developer, String genre, int numberOfPlayers) {
            super(name, version, developer);
            this.genre = genre;
            this.numberOfPlayers = numberOfPlayers;
        }

        public String getGenre() {
            return genre;
        }

        public int getNumberOfPlayers() {
            return numberOfPlayers;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setNumberOfPlayers(int numberOfPlayers) {
            this.numberOfPlayers = numberOfPlayers;
        }

        @Override
        public void run() {
            System.out.println(getName() + " is running.");
        }

        @Override
        public void displayInfo() {
            System.out.println("Application Name: " + getName());
            System.out.println("Version: " + getVersion());
            System.out.println("Developer: " + getDeveloper());
            System.out.println("Genre: " + genre);
            System.out.println("Number of Players: " + numberOfPlayers);
        }
    }

    // Класс Погода, наследуется от Приложение
    class Weather extends Application {
        private String location;
        private double temperature;

        private static int numberOfWeatherApps = 0;  // Счетчик созданных объектов Weather

        public Weather(String name, String version, String developer, String location, double temperature) {
            super(name, version, developer);
            this.location = location;
            this.temperature = temperature;
            numberOfWeatherApps++;  // Увеличиваем счетчик при создании объекта
        }

        public String getLocation() {
            return location;
        }

        public double getTemperature() {
            return temperature;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setTemperature(double temperature) {
            this.temperature = temperature;
        }@Override
        public void run() {
            System.out.println(getName() + " is running.");
        }

        @Override
        public void displayInfo() {
            System.out.println("Application Name: " + getName());
            System.out.println("Version: " + getVersion());
            System.out.println("Developer: " + getDeveloper());
            System.out.println("Location: " + location);
            System.out.println("Temperature: " + temperature + " degrees Celsius");
        }

        public static int getNumberOfWeatherApps() {
            return numberOfWeatherApps;
        }
    }
    class labav {
        public static void main(String[] args) {
            SocialNetwork facebook = new SocialNetwork("Facebook", "v1.0", "Facebook Inc.", 2000000000, "Web");
            Game minecraft = new Game("Minecraft", "v1.16", "Mojang Studios", "Sandbox", 4);
            Weather weatherApp1 = new Weather("WeatherApp1", "v1.2", "WeatherCo", "New York", 25.5);
            Weather weatherApp2 = new Weather("WeatherApp2", "v1.1", "WeatherCo", "London", 18.0);

            // Вывод информации о приложениях
            System.out.println("Social Network App Info:");
            facebook.displayInfo();
            facebook.run();
            System.out.println();

            System.out.println("Game App Info:");
            minecraft.displayInfo();
            minecraft.run();
            System.out.println();

            System.out.println("Weather App 1 Info:");
            weatherApp1.displayInfo();
            weatherApp1.run();
            System.out.println();

            System.out.println("Weather App 2 Info:");
            weatherApp2.displayInfo();
            weatherApp2.run();
            System.out.println();

            // Вывод количества созданных приложений погоды
            System.out.println("Number of Weather Apps: " + Weather.getNumberOfWeatherApps());
        }
}
