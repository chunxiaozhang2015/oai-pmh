package ch.epfl.gsn.oai.demoimpl;


import ch.epfl.gsn.oai.interfaces.MetadataFormat;

import javax.inject.Named;

/**
 * Created by kryvych on 07/09/15.
 */
@Named
public class DifFormat implements MetadataFormat {

    @Override
    public String getName() {
        return "dif";
    }

}
