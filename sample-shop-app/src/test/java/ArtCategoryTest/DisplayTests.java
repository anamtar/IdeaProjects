package ArtCategoryTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import sampleshop.art.ArtCategory;

public class DisplayTests {
    @Test
    public void artCategoryisDisplaeyd(){
        ArtCategory artCat = new ArtCategory();

        String result = artCat.displayArtCategory();

        Assert.assertEquals(result, "Art");
    }
}
