package mirea2419.ru.lb6;

package mirea2419.ru.lb6;

public class SortingStudentsByGPA implements Comparator {
    @Override
    public void QuickSort(Student[] array,int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftMarker + rightMarker) / 2].gpa;
        do {
            while (array[leftMarker].gpa < pivot) {
                leftMarker++;
            }
            while (array[rightMarker].gpa > pivot) {
                rightMarker--;
            }
            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    int tmp = array[leftMarker].gpa;
                    array[leftMarker].gpa = array[rightMarker].gpa;
                    array[rightMarker].gpa = tmp;
                }
                leftMarker++;
                rightMarker--;
            }
        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            QuickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            QuickSort(array, leftBorder, rightMarker);
        }
        System.out.print("\n");
        for(int i=0;i<10;i++)
        {
            System.out.print(array[i].id);
            System.out.print("  ");
            System.out.print(array[i].name);
            System.out.print("  ");
            System.out.print(array[i].gpa);
            System.out.print("\n");
        }

    }
}

