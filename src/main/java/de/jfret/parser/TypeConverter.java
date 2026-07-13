package de.jfret.parser;

public class TypeConverter {

    public String getScopeStringFromType(ReqModel.ScopeType type) {
        switch (type) {
            case NONE -> { return "null"; }
            case GLOBALLY -> { return "globally"; }
            case IN -> { return "in"; }
            case NOT_IN -> { return "notin"; }
            case AFTER -> { return "after"; }
            case BEFORE -> { return "before"; }
            case ONLY_IN ->  { return "onlyIn"; }
            //NONE, GLOBALLY, IN, IN_MODE, AFTER, BEFORE, ONLY_AFTER, ONLY_BEFORE, ONLY_IN, NOT_IN, UNHANDLED
        }

        return type.name();
    }

    public String getConditionStringFromType(ReqModel.ConditionType type) {
        switch (type) {
            case NONE -> {
                return "null";
            }

            case REGULAR -> {
                return "regular";
            }
        }

        return type.name();
    }

    public String getTimingStringFromType(ReqModel.TimingType type) {
        switch (type) {
            case NONE -> { return "null"; }
            case WITHIN -> { return "within"; }
            case FOR -> { return "for"; }
            case AFTER -> { return "after"; }
            case UNTIL -> { return "until"; }
            case BEFORE -> { return "before"; }
            case IMMEDIATELY -> { return "immediately"; }
            case NEXT -> { return "next"; }
            case FINALLY -> { return "finally"; }
            case ALWAYS -> { return "always"; }
            case NEVER -> { return "never"; }
            //NONE, WITHIN, FOR, AFTER, UNTIL, BEFORE, IMMEDIATELY, NEXT, FINALLY, ALWAYS, NEVER
        }

        return type.name();
    }

    public String getResponseStringFromType(ReqModel.ResponseType type) {
        switch (type) {
            case NONE -> {
                return "null";
            }

            case SATISFACTION -> {
                return "satisfaction";
            }
        }

        return type.name();
    }
}
