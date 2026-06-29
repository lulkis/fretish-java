package de.jfret.parser;

public class TypeConverter {

    public String getScopeStringFromType(ReqModel.ScopeType type) {
        switch (type) {
            case NONE -> {
                return "null";
            }
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
            case NONE -> {
                return "null";
            }

            case NEVER -> {
                return "never";
            }
            case NEXT -> {
                return "next";
            }
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
