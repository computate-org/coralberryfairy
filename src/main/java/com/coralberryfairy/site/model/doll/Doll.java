package com.coralberryfairy.site.model.doll;

import java.math.BigDecimal;

import org.computate.search.wrap.Wrap;
import org.computate.vertx.config.ComputateConfigKeys;

import com.coralberryfairy.site.result.BaseResult;

/**
 * Order: 0
 * 
 * Api: true
 * Page: true
 * SuperPage: BaseResultPage
 * Indexed: true
 * Description: See the available dolls
 * 
 * ApiTag: product
 * 
 * ApiUri: /api/product/doll
 * PageListUri: /product/doll
 * PageEditUri: /edit/product/doll
 * PageDisplayUri: /product/doll
 * 
 * ApiMethod:
 *   Search:
 *   GET:
 *   PATCH:
 *   POST:
 *   PUTImport:
 *   SearchPage:
 *     Page: DollPage
 *     ApiUri: /edit/doll
 * AuthGroup:
 *   SuperAdmin:
 *     POST:
 *     PATCH:
 *     GET:
 *     DELETE:
 *     SuperAdmin:
 * 
 * PublicRead: true
 * 
 * AName: a doll
 * Icon: <i class="fa-solid fa-reel"></i>
 * Sort.asc: name
 */
public class Doll extends DollGen<BaseResult> {

  /**
   * {@inheritDoc}
   * DocValues: true
   * Persist: true
   * DisplayName: Name
   * Description: A descriptive name for the doll
   * HtmRow: 3
	 * HtmRowTitleOpen: Doll information
   * HtmCell: 1
   * HtmColumn: 1
   * Facet: true
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
	 * Facet: true
	 * DisplayName: Page ID
	 * Description: The ID for this page. 
	 */
	protected void _pageId(Wrap<String> w) {
		toId(name);
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
	 * HtmRow: 3
	 * HtmCell: 3
	 * Facet: true
	 * DisplayName: URI
	 * Description: The relative URI for this page. 
	 */
	protected void _uri(Wrap<String> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * HtmRow: 4
	 * HtmRowTitleOpen: Useful URLs
	 * HtmCell: 1
	 * Facet: true
	 * DisplayName: product page
	 * Description: Visit this product's landing page. 
	 * Link: true
	 */
	protected void _url(Wrap<String> w) {
		w.o(String.format("%s%s", siteRequest_.getConfig().getString(ComputateConfigKeys.SITE_BASE_URL), uri));
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: store URL
	 * Description: The store URL for this page. 
	 */
	protected void _storeUrl(Wrap<String> w) {
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
	 * DisplayName: title
	 * Description: The title of this page. 
	 * UrlVar: pageUrlId
	 */
	protected void _title(Wrap<String> w) {
		w.o(name);
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * Facet: true
	 * DisplayName: Product Number
	 * Description: The product number for this page. 
	 */
	protected void _productNum(Wrap<Integer> w) {
	}

	/**
	 * {@inheritDoc}
	 * DocValues: true
	 * Persist: true
	 * DisplayName: title
	 * Description: The title of this page. 
	 * UrlVar: pageUrlId
	 */
	protected void _imageUri(Wrap<String> w) {
	}

	@Override
	protected void _objectTitle(Wrap<String> w) {
		w.o(String.format("%s — %s", Doll_NameAdjectiveSingular_enUS, title));
	}

	@Override
	protected void _objectId(Wrap<String> w) {
		w.o(pageId);
	}

	@Override
	protected void _id(Wrap<String> w) {
		w.o(String.format("%s_%s", CLASS_SIMPLE_NAME, pageId));
	}

	@Override
	protected void _pageUrlId(Wrap<String> w) {
		w.o(url);
	}
}
