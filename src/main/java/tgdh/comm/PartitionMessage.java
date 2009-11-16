package tgdh.comm;

import java.security.PublicKey;

import tgdh.TgdhException;
import tgdh.tree.LeafNode;

/**
 * This class implements the PartitionMessage in tgdh-protocol. When a few 
 * members (at least one member) can't communicate with the group, a new 
 * PartitionMessage will be generated by the rest members independently.
 * So all functions about the signature will not be supported.
 *    
 * @author Lijun Liao (<a href="mailto:lijun.liao@rub.de">lijun.liao@rub.de)
 * @version 1.0
 */
public class PartitionMessage extends TgdhMessage {
    private LeafNode[] toLeaves;


	/**
	 * Constucts a new PartitionMessage with detail nodes who leave the group
	 * @param toLeaves   the nodes who leave the group
	 */
    public PartitionMessage(LeafNode[] toLeaves){
    	super();
    	this.toLeaves = toLeaves;    	
    }
    
    /**
     * Returns the nodes who leave the group
     * @return Returns the leafnodes.
     */
    public LeafNode[] getToLeaves() {
        return toLeaves;
    }    
    

    /**
     * not supported
     */
    protected byte[] toByteArray() {
		throw new UnsupportedOperationException("toByteArray() not supported");
    }    

	/**
	 * not supported
	 */
	public PublicKey getPublic() {
		throw new UnsupportedOperationException("getPublic() not supported");
	}

	/**
	 * not supported
	 */
	public String getSignerName() {
		throw new UnsupportedOperationException("getSignerName() not supported");
	}
	
	/**
	 * not supported
	 */
	public void init4verify(PublicKey key) {
		throw new UnsupportedOperationException("init4verify(PublicKey) not supported");
	}

	/**
	 * not supported
	 */	
	public void setPublic(PublicKey key) {
		throw new UnsupportedOperationException("setPublic(PublicKey) not supported");
	}

	/**
	 * not supported
	 */
	public void sign() throws TgdhException {
		throw new UnsupportedOperationException("sign() not supported");
	}
	
	/**
	 * not supported
	 */
	public boolean verify() throws TgdhException {
		throw new UnsupportedOperationException("verify() not supported");
	}

}
