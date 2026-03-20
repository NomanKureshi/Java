enum Day
{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

class EnumDemo
{
    public static void main(String[] args)
    {
        Day d = Day.WEDNESDAY;

        System.out.println("Selected Day: " + d);

        switch(d)
        {
            case MONDAY:
                System.out.println("Start of week");
                break;

            case WEDNESDAY:
                System.out.println("Mid of week");
                break;

            case SUNDAY:
                System.out.println("Holiday");
                break;

            default:
                System.out.println("Normal day");
        }
    }
}
