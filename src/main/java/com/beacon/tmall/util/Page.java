package com.beacon.tmall.util;

public class Page {
    private static final int defaultCount = 5;
    int start;
    int count;
    int total;
    String param;


    public Page() {
        this.count = defaultCount;
    }

    public Page(int start, int count) {
        this();
        this.start = start;
        this.count = count;
    }

    public boolean isHasPreviouse() {
        if (start == 0) {
            return false;
        }
        return true;
    }

    public boolean isHasNext() {
        if (start == getLast()) {
            return false;
        }
        return true;
    }

    public int getTotalPage() {
        int totalPage;
        if (total % count == 0) {
            totalPage = total / count;
        } else {
            totalPage = total / count + 1;
        }

//        if (0 == totalPage) {
//            totalPage = 1;
//        }
        return totalPage;

    }

    public int getLast() {
        int last;
        if (total % count == 0) {
            last = total - count;
        } else {
            int temp = total % count;
            last = total - temp;
        }

        return last;
    }


    @Override
    public String toString() {
        return "Page{" +
                "start=" + start +
                ", count=" + count +
                ", last=" + total +
                ", param='" + param + '\'' +
                '}';
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
