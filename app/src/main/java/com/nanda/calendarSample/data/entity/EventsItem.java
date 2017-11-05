package com.nanda.calendarSample.data.entity;

/**
 * Created by Nandagopal on 10/28/2017.
 */

public class EventsItem {

    private boolean isPtm;
    private boolean isFieldTrip;
    private boolean isRemainder;
    private boolean isHalfHoliday;
    private boolean isFullHoliday;

    public EventsItem(boolean isPtm, boolean isFieldTrip, boolean isRemainder, boolean isHalfHoliday, boolean isFullHoliday) {
        this.isPtm = isPtm;
        this.isFieldTrip = isFieldTrip;
        this.isRemainder = isRemainder;
        this.isHalfHoliday = isHalfHoliday;
        this.isFullHoliday = isFullHoliday;
    }

    public boolean isPtm() {
        return isPtm;
    }

    public void setPtm(boolean ptm) {
        isPtm = ptm;
    }

    public boolean isFieldTrip() {
        return isFieldTrip;
    }

    public void setFieldTrip(boolean fieldTrip) {
        isFieldTrip = fieldTrip;
    }

    public boolean isRemainder() {
        return isRemainder;
    }

    public void setRemainder(boolean remainder) {
        isRemainder = remainder;
    }

    public boolean isHalfHoliday() {
        return isHalfHoliday;
    }

    public void setHalfHoliday(boolean halfHoliday) {
        isHalfHoliday = halfHoliday;
    }

    public boolean isFullHoliday() {
        return isFullHoliday;
    }

    public void setFullHoliday(boolean fullHoliday) {
        isFullHoliday = fullHoliday;
    }
}
