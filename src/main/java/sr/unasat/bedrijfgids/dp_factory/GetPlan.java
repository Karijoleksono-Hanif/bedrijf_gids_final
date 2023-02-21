package sr.unasat.bedrijfgids.dp_factory;

class GetPlan {

    public Plan getPlan(String planType) {

        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("standardplan")) {
            return new StandardPlan();
        } else if (planType.equalsIgnoreCase("commercieelplan")) {
            return new CommercieelPlan();
        }
        return null;
    }
}
