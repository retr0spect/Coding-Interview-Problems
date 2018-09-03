/**
 * Created by Aditya on 9/3/2018.
 */
class Searching {

    static boolean binarySearch(int[] integers, int key) {
        int l = 0, u = integers.length - 1;
        while (l <= u) {
            int mid = (l + u) / 2;
            int midVal = integers[mid];
            if (midVal == key) return true;
            if (key > midVal) l = mid + 1;
            if (key < midVal) u = mid - 1;
        }
        return false;
    }

    static int firstOccurrenceOfK(int[] list, int key) {
        int lowestIndex = -1;
        int l = 0, r = list.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            int midVal = list[mid];
            if (key < midVal) r = mid - 1;
            if (key > midVal) l = mid + 1;
            if (key == midVal) {
                lowestIndex = mid;
                r = mid - 1;
            }
        }
        return lowestIndex;
    }

    static int kEqualsIndex(int[] list) {
        int l = 0, r = list.length - 1;
        while (l <= r) {
            int mid = l + ((r - l) / 2);
            int midVal = list[mid];
            int difference = mid - midVal;
            if (difference == 0) {
                return mid;
            } else if (difference < 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }

    static int cyclicSortedArray(int[] list) {
        int l = 0, r = list.length - 1;
        while (l < r) {
            int mid = l + ((r - l) / 2);
            if (list[mid] > list[r]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return list[l];
    }
}
