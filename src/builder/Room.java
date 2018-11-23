package builder;

public class Room {

    private RoomType type;

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType val) {
        this.type = val;
    }
    
    @Override
    public String toString() {
        return "Room  = " + getType();
    }
    
}
