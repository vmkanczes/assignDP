package builder;

public class RestRoomBuilder implements RoomBuilder {

    private Room room;

    public RestRoomBuilder() {
        this.room = new Room();
    }

    @Override
    public Room getRoom() {
        return this.room;
    }

    @Override
    public void buildRoom() {
        room.setType(RoomType.REST);
    }




   
}
