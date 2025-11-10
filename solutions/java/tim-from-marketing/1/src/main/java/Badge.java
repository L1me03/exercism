class Badge {

    
    
    public String print(Integer id, String name, String department) {
        String split = " - ";
        String formattedId = (id != null) ? "[" + id.toString() + "]" : "";
        String departmentUpper = (department != null) ? department.toUpperCase() : "OWNER";

        if (id == null) {
            return name + split + departmentUpper;
        } else {
            return formattedId + split + name + split + departmentUpper;
        }
    }
}
