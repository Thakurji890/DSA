class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
       if(!knightIsAwake)
           return true;
        return false;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake || archerIsAwake || prisonerIsAwake)
            return true;
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(prisonerIsAwake)
            if(!archerIsAwake)
                return true;
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        if(petDogIsPresent && !archerIsAwake)
            return true;
        if(!petDogIsPresent && prisonerIsAwake )
            if(!archerIsAwake && !knightIsAwake)
                return true;
        return false;
    }
}
