class SnapshotArray {
    //map <Snap_id , Value> for each index (array of maps)
    HashMap<Integer,Integer> [] snapShotHistory;
    
    //totalSnaps taken
    int totalSnaps;

    //map of delta updates made <index, value>
    HashMap<Integer,Integer> deltaUpdate;
    
    public SnapshotArray(int length) {
        //keep track of the delta updates made in each iteration
        deltaUpdate=new HashMap<>();
        
        //initialize a snapshot history
        snapShotHistory=new HashMap[length];
        for(int i=0; i<length; i++){
            snapShotHistory[i]=new HashMap<>();
        }
    }
    
    public void set(int index, int val) {
        //add a delta update for this index, value pair
        deltaUpdate.put(index,val);
    }
    
    public int snap() {
        //add the current mapping at each index, value pair
        for (int key: deltaUpdate.keySet()){
            HashMap<Integer, Integer> snapHistoryAtIndex = snapShotHistory[key];
            //add a snapshot of the <snapId, value> to the index updated
            snapHistoryAtIndex.put(totalSnaps, deltaUpdate.get(key));
        }
        
        //reset out delta update map
        deltaUpdate=new HashMap<>();
        
        //incremement our total snaps and return the snap id
        totalSnaps++;
        return totalSnaps-1;
    }
    
    public int get(int index, int snap_id) {
        //find the most recent update to that index from the snapId specified and before
        while(snap_id>=0){
            if(snapShotHistory[index].containsKey(snap_id))
                 return snapShotHistory[index].get(snap_id);
            snap_id--;
        }
        
        //if there was never an update to that index, it will just be equal to 0
        return 0;
    }
}