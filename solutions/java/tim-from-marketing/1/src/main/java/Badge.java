class Badge {
    public String print(Integer id, String name, String department) {
        department = department == null ? "OWNER" : department;
            if(id == null){ return name + " - " + department.toUpperCase();}
            
            return ("[" + id + "] - " + name + " - " + department.toUpperCase());
    }
}
