
class Flower {
    public String whatsYourName() {
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lily extends Flower {
    @Override
    public String whatsYourName() {
        return "Lily";
    }
}

class Lotus extends Flower {
    @Override
    public String whatsYourName() {
        return "Lotus";
    }
}

class Region {
    public Flower yourNationalFlower() {
        return new Flower();
    }
}

class WestBengal extends Region {
    @Override
    public Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class AndhraPradesh extends Region {
    @Override
    public Lily yourNationalFlower() {
        return new Lily();
    }
}

class Karnataka extends Region {
    @Override
    public Lotus yourNationalFlower() {
        return new Lotus();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna