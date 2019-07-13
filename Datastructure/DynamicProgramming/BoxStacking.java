public class BoxStacking {

    // Notes:
    // 1 -> Find combination of each box.
    // 2 -> Sort by base area
    // IMPORTANT
    // 3 -> Fill another array with current height of each combination(i.e Its height if only that was placed)
    // 4 -> Do LIS on that array.
    // 5 -> Also store the boxe placed on current box in a seperate array.

    // Finding combination
    // rot1.h = box.w
    // rot1.l = Math.max(box.h, box.l)
    // rot1.w = Math.min(box.h, box.l)

    // rot2.h = box.l
    // rot2.l = Math.max(box.h, box.w)
    // rot2.w = Math.min(box.h, box.w)

}