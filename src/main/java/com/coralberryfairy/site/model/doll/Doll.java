package com.coralberryfairy.site.model.doll;

import java.io.File;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.wrap.Wrap;
import org.computate.vertx.config.ComputateConfigKeys;

import com.coralberryfairy.site.config.ConfigKeys;
import com.coralberryfairy.site.model.BaseModel;
import com.coralberryfairy.site.result.BaseResult;

/**
 * Order: 5
 * Description: See the available dolls
 * PublicRead: true
 * AName: a doll
 * Icon: <i class="{{ FONTAWESOME_STYLE }} fa-reel"></i>
 * Rows: 100
 * Sort.asc: name
 * 
 * SearchPageUri: /search/doll
 * EditPageUri: /edit/doll/{pageId}
 * DisplayPageUri: /view/doll/{pageId}
 * ApiUri: /api/doll
 * ApiMethod:
 *   Search:
 *   GET:
 *   PATCH:
 *   POST:
 *   DELETE:
 *   PUTImport:
 * AuthGroup:
 *   Admin:
 *     POST:
 *     PATCH:
 *     GET:
 *     PUT:
 *     DELETE:
 *     Admin:
 * AuthGroup:
 *   SuperAdmin:
 *     POST:
 *     PATCH:
 *     GET:
 *     DELETE:
 *     Admin:
 *     SuperAdmin:
 */
public class Doll extends DollGen<BaseResult> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: name
   * Description: A descriptive name for the doll
   * HtmRow: 3
   * HtmRowTitleOpen: Doll information
   * HtmCell: 1
   * HtmColumn: 1
   * Facet: true
   * VarName: true
   */
  protected void _name(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: product description
   * Description: The product description. 
   * HtmRow: 3
   * HtmCell: 2
   * HtmColumn: 2
   * Facet: true
   * VarDescription: true
   */
  protected void _description(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: price
   * Description: The price of the product.
   * HtmRow: 3
   * HtmCell: 3
   * Facet: true
   */
  protected void _price(Wrap<BigDecimal> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * HtmRowTitleOpen: Useful URLs
   * HtmRow: 99
   * HtmCell: 1
   * Facet: true
   * DisplayName: Page ID
   * Description: The ID for this page. 
   * VarId: true
   */
  protected void _pageId(Wrap<String> w) {
    w.o(toId(name));
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * Facet: true
   * DisplayName: resource URI
   * Description: The resource relative URI for this page. 
   */
  protected void _resourceUri(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * Facet: true
   * DisplayName: template URI
   * Description: The template relative URI for this page. 
   */
  protected void _templateUri(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * HtmRow: 4
   * HtmCell: 1
   * Facet: true
   * DisplayName: imageUri
   * Description: The page image URI
   */
  protected void _pageImageUri(Wrap<String> w) {
  }
  
  /**
   * DocValues: true
   * Description: The image width
   */
  protected void _pageImageWidth(Wrap<Integer> w) {
    if(pageImageUri != null) {
      Path path = Paths.get(siteRequest_.getConfig().getString(ConfigKeys.STATIC_PATH), pageImageUri);
      File file = path.toFile();
      if(file.exists()) {
        try {
          BufferedImage img = ImageIO.read(file);
          w.o(img.getWidth());
          setPageImageHeight(img.getHeight());
          setPageImageType(Files.probeContentType(path));
        } catch (Exception ex) {
          ExceptionUtils.rethrow(ex);
        }
      }
    }
  }

  /**
   * DocValues: true
   * Description: The image height
   */
  protected void _pageImageHeight(Wrap<Integer> c) {
  }

  /**
   * DocValues: true
   * Description: The image height
   */
  protected void _pageImageType(Wrap<String> c) {
  }

  /**
   * Persist: true
   * DocValues: true
   * Description: The image accessibility text. 
   */
  protected void _pageImageAlt(Wrap<String> c) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * Facet: true
   * DisplayName: email template
   * Description: The HTML email template for this product. 
   */
  protected void _emailTemplate(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * Facet: true
   * DisplayName: Instagram URL
   * Description: The Instagram URL for this page. 
   */
  protected void _instagramUrl(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * Facet: true
   * DisplayName: Space-separated Instagram hashtags
   * Description: The Instagram hashtags for this doll as space-separated hashtags
   */
  protected void _hashtags(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * Facet: true
   * DisplayName: List of Instagram hashtag names
   * Description: List of the Instagram hashtag names for this doll
   */
  protected void _hashtagsList(List<String> l) {
    if (hashtags != null) {
      l.addAll(Arrays.stream(hashtags.split(" ")).map(s -> s.replace("#", "")).collect(Collectors.toList()));
    }
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: title
   * Description: The title of this page. 
   * UrlVar: pageUrlId
   */
  protected void _title(Wrap<String> w) {
    w.o(name);
  }

  @Override
  public String idForClass() {
    return pageId;
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: labels string
   * Description: The labels String for this article comma-separated. 
   */
  protected void _labelsString(Wrap<String> w) {
  }

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: labels
   * Description: The labels for this article. 
   * HtmRow: 5
   * HtmCell: 2
   * Facet: true
   */
  protected void _labels(List<String> l) {
    if(labelsString != null) {
      l.addAll(Arrays.asList(StringUtils.split(labelsString, ",")).stream().map(id -> id.trim()).collect(Collectors.toList()));
    }
  }
}
