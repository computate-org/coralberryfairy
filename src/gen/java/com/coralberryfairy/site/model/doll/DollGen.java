package com.coralberryfairy.site.model.doll;

import com.coralberryfairy.site.request.SiteRequest;
import com.coralberryfairy.site.result.BaseResult;
import com.coralberryfairy.site.model.BaseModel;
import org.computate.vertx.api.ApiRequest;
import com.coralberryfairy.site.config.ConfigKeys;
import java.util.Optional;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.search.serialize.ComputateLocalDateSerializer;
import org.computate.search.serialize.ComputateLocalDateDeserializer;
import org.computate.search.serialize.ComputateZonedDateTimeSerializer;
import org.computate.search.serialize.ComputateZonedDateTimeDeserializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.math.MathContext;
import org.apache.commons.lang3.math.NumberUtils;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.RoundingMode;
import java.util.Map;
import java.lang.String;
import java.math.BigDecimal;
import java.lang.Integer;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;
import io.vertx.core.json.JsonArray;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.computate.search.response.solr.SolrResponse;
import io.vertx.core.json.JsonObject;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class DollGen into the class Doll. 
 * </li><li>You can add a class comment "Model: true" if you wish to persist these Doll objects in a relational PostgreSQL database transactionally in the RESTful API. 
 * The code to persist and query the DollGen data in the database will then be automatically generated. 
 * </li>
 * <h3>About the Doll class and it's generated class DollGen&lt;BaseResult&gt;: </h3>extends DollGen
 * <p>
 * This Java class extends a generated Java class DollGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll">Find the class Doll in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends DollGen<BaseResult>
 * <p>This <code>class Doll extends DollGen&lt;BaseResult&gt;</code>, which means it extends a newly generated DollGen. 
 * The generated <code>class DollGen extends BaseResult</code> which means that Doll extends DollGen which extends BaseResult. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <p>This class contains a comment <b>"Api: true"</b>, which means this class will have Java Vert.x API backend code generated for these objects. 
 * </p>
 * <h2>ApiMethode: Search</h2>
 * <p>This class contains a comment <b>"ApiMethod: Search"</b>, which creates an API "Search". 
 * </p>
 * <h2>ApiMethode: GET</h2>
 * <p>This class contains a comment <b>"ApiMethod: GET"</b>, which creates an API "GET". 
 * </p>
 * <h2>ApiMethode: PATCH</h2>
 * <p>This class contains a comment <b>"ApiMethod: PATCH"</b>, which creates an API "PATCH". 
 * </p>
 * <h2>ApiMethode: POST</h2>
 * <p>This class contains a comment <b>"ApiMethod: POST"</b>, which creates an API "POST". 
 * </p>
 * <h2>ApiMethode: DELETE</h2>
 * <p>This class contains a comment <b>"ApiMethod: DELETE"</b>, which creates an API "DELETE". 
 * </p>
 * <h2>ApiMethode: PUTImport</h2>
 * <p>This class contains a comment <b>"ApiMethod: PUTImport"</b>, which creates an API "PUTImport". 
 * </p>
 * <h2>ApiMethode: SearchPage</h2>
 * <p>This class contains a comment <b>"ApiMethod: SearchPage"</b>, which creates an API "SearchPage". 
 * </p>
 * <h2>ApiMethode: EditPage</h2>
 * <p>This class contains a comment <b>"ApiMethod: EditPage"</b>, which creates an API "EditPage". 
 * </p>
 * <h2>ApiMethode: DisplayPage</h2>
 * <p>This class contains a comment <b>"ApiMethod: DisplayPage"</b>, which creates an API "DisplayPage". 
 * </p>
 * <h2>ApiMethode: DELETEFilter</h2>
 * <p>This class contains a comment <b>"ApiMethod: DELETEFilter"</b>, which creates an API "DELETEFilter". 
 * </p>
 * <h2>ApiTag.enUS: true</h2>
 * <p>This class contains a comment <b>"ApiTag: dolls"</b>, which groups all of the OpenAPIs for Doll objects under the tag "dolls". 
 * </p>
 * <h2>ApiUri.enUS: /api/product/doll</h2>
 * <p>This class contains a comment <b>"ApiUri: /api/product/doll"</b>, which defines the base API URI for Doll objects as "/api/product/doll" in the OpenAPI spec. 
 * </p>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <p>This class contains a comment <b>"Indexed: true"</b>, which means this class will be indexed in the search engine. 
 * Every protected void method that begins with "_" that is marked to be searched with a comment like "Indexed: true", "Stored: true", or "DocValues: true" will be indexed in the search engine. 
 * </p>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the Doll class will inherit the helpful inherited class comments from the super class DollGen. 
 * </p>
 * <h2>Rows: 100</h2>
 * <p>This class contains a comment <b>"Rows: 100"</b>, which means the Doll API will return a default of 100 records instead of 10 by default. 
 * Each API has built in pagination of the search records to ensure a user can query all the data a page at a time without running the application out of memory. 
 * </p>
 * <h2>Order: 5</h2>
 * <p>This class contains a comment <b>"Order: 5"</b>, which means this class will be sorted by the given number 5 ascending when code that relates to multiple classes at the same time is generated. 
 * </p>
 * <h2>SqlOrder: 5</h2>
 * <p>This class contains a comment <b>"SqlOrder: 5"</b>, which means this class will be sorted by the given number 5 ascending when SQL code to create and drop the tables is generated. 
 * </p>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <p>This class contains a comment <b>"Page: true"</b>, which means this class will have webpage code generated for these objects. 
 * Java Vert.x backend API code, Handlebars HTML template frontend code, and JavaScript code will all generated and can be extended. 
 * This creates a new Java class com.coralberryfairy.site.model.doll.DollPage. 
 * </p>
 * <h2>SuperPage.enUS: PageLayout</h2>
 * <p>This class contains a comment <b>"SuperPage.enUS: PageLayout"</b>, which identifies the Java super class of the page code by it's class simple name "PageLayout". 
 * This means that the newly created class com.coralberryfairy.site.model.doll.DollPage extends com.coralberryfairy.site.page.PageLayout. 
 * </p>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the Doll Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
 * </p>
 * <p>
 *   Adding protected void methods beginning with an underscore with a Promise as the only parameter will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   <pre>
 *   
 *   	protected void _promiseBefore(Promise&lt;Void&gt; promise) {
 *   		promise.complete();
 *   	}
 *   </pre>
 * </p>
 * <p>
 *   Java classes with the `Model: true` will automatically set `Promise: true`. 
 * </p>
 * <p>
 *   If a super class of this Java class with `Model: true`, then the child class will also inherit `Promise: true`. 
 * </p>
 * <h2>AName.enUS: a doll</h2>
 * <p>This class contains a comment <b>"AName.enUS: a doll"</b>, which identifies the language context to describe a Doll as "a doll". 
 * </p>
 * <p>
 * Delete the class Doll in Solr: 
 * curl -k 'https://solr.apps-crc.testing/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the package com.coralberryfairy.site.model.doll in Solr: 
 * curl -k 'https://solr.apps-crc.testing/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomEnsemble_enUS_indexed_string:com.coralberryfairy.site.model.doll&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * <p>
 * Delete  the project coralberryfairy in Solr: 
 * curl -k 'https://solr.apps-crc.testing/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;siteNom_indexed_string:coralberryfairy&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
 * </p>
 * Generated: true
 **/
public abstract class DollGen<DEV> extends BaseResult {
	protected static final Logger LOG = LoggerFactory.getLogger(Doll.class);

	public static final String Description_enUS = "See the available dolls";
	public static final String AName_enUS = "a doll";
	public static final String This_enUS = "this ";
	public static final String ThisName_enUS = "this doll";
	public static final String A_enUS = "a ";
	public static final String TheName_enUS = "the doll";
	public static final String SingularName_enUS = "doll";
	public static final String PluralName_enUS = "dolls";
	public static final String NameActual_enUS = "current doll";
	public static final String AllName_enUS = "all dolls";
	public static final String SearchAllNameBy_enUS = "search dolls by ";
	public static final String SearchAllName_enUS = "search dolls";
	public static final String Title_enUS = "dolls";
	public static final String ThePluralName_enUS = "the dolls";
	public static final String NoNameFound_enUS = "no doll found";
	public static final String ApiUri_enUS = "/api/product/doll";
	public static final String ApiUriSearchPage_enUS = "/product/doll";
	public static final String ApiUriEditPage_enUS = "/edit/product/doll/{pageId}";
	public static final String OfName_enUS = "of doll";
	public static final String ANameAdjective_enUS = "a doll";
	public static final String NameAdjectiveSingular_enUS = "doll";
	public static final String NameAdjectivePlural_enUS = "dolls";
	public static final String Search_enUS_OpenApiUri = "/api/product/doll";
	public static final String Search_enUS_StringFormatUri = "/api/product/doll";
	public static final String Search_enUS_StringFormatUrl = "%s/api/product/doll";
	public static final String GET_enUS_OpenApiUri = "/api/product/doll/{pageId}";
	public static final String GET_enUS_StringFormatUri = "/api/product/doll/%s";
	public static final String GET_enUS_StringFormatUrl = "%s/api/product/doll/%s";
	public static final String PATCH_enUS_OpenApiUri = "/api/product/doll";
	public static final String PATCH_enUS_StringFormatUri = "/api/product/doll";
	public static final String PATCH_enUS_StringFormatUrl = "%s/api/product/doll";
	public static final String POST_enUS_OpenApiUri = "/api/product/doll";
	public static final String POST_enUS_StringFormatUri = "/api/product/doll";
	public static final String POST_enUS_StringFormatUrl = "%s/api/product/doll";
	public static final String DELETE_enUS_OpenApiUri = "/api/product/doll/{pageId}";
	public static final String DELETE_enUS_StringFormatUri = "/api/product/doll/%s";
	public static final String DELETE_enUS_StringFormatUrl = "%s/api/product/doll/%s";
	public static final String PUTImport_enUS_OpenApiUri = "/api/product/doll-import";
	public static final String PUTImport_enUS_StringFormatUri = "/api/product/doll-import";
	public static final String PUTImport_enUS_StringFormatUrl = "%s/api/product/doll-import";
	public static final String SearchPage_enUS_OpenApiUri = "/product/doll";
	public static final String SearchPage_enUS_StringFormatUri = "/product/doll";
	public static final String SearchPage_enUS_StringFormatUrl = "%s/product/doll";
	public static final String EditPage_enUS_OpenApiUri = "/edit/product/doll/{pageId}";
	public static final String EditPage_enUS_StringFormatUri = "/edit/product/doll/%s";
	public static final String EditPage_enUS_StringFormatUrl = "%s/edit/product/doll/%s";
	public static final String DisplayPage_enUS_OpenApiUri = "/view/product/doll/{pageId}";
	public static final String DisplayPage_enUS_StringFormatUri = "/view/product/doll/%s";
	public static final String DisplayPage_enUS_StringFormatUrl = "%s/view/product/doll/%s";
	public static final String DELETEFilter_enUS_OpenApiUri = "/api/product/doll";
	public static final String DELETEFilter_enUS_StringFormatUri = "/api/product/doll";
	public static final String DELETEFilter_enUS_StringFormatUrl = "%s/api/product/doll";

	public static final String Icon = "<i class=\"fa-solid fa-reel\"></i>";
	public static final Integer Rows = 100;

	//////////
	// name //
	//////////


	/**	 The entity name
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String name;

	/**	<br> The entity name
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:name">Find the entity name in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _name(Wrap<String> w);

	public String getName() {
		return name;
	}
	public void setName(String o) {
		this.name = Doll.staticSetName(siteRequest_, o);
	}
	public static String staticSetName(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll nameInit() {
		Wrap<String> nameWrap = new Wrap<String>().var("name");
		if(name == null) {
			_name(nameWrap);
			Optional.ofNullable(nameWrap.getO()).ifPresent(o -> {
				setName(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchName(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrName(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqName(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchName(siteRequest_, Doll.staticSetName(siteRequest_, o)).toString();
	}

	public String sqlName() {
		return name;
	}

	/////////////////
	// description //
	/////////////////


	/**	 The entity description
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String description;

	/**	<br> The entity description
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:description">Find the entity description in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _description(Wrap<String> w);

	public String getDescription() {
		return description;
	}
	public void setDescription(String o) {
		this.description = Doll.staticSetDescription(siteRequest_, o);
	}
	public static String staticSetDescription(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll descriptionInit() {
		Wrap<String> descriptionWrap = new Wrap<String>().var("description");
		if(description == null) {
			_description(descriptionWrap);
			Optional.ofNullable(descriptionWrap.getO()).ifPresent(o -> {
				setDescription(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchDescription(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrDescription(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDescription(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchDescription(siteRequest_, Doll.staticSetDescription(siteRequest_, o)).toString();
	}

	public String sqlDescription() {
		return description;
	}

	///////////
	// price //
	///////////


	/**	 The entity price
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal price;

	/**	<br> The entity price
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:price">Find the entity price in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _price(Wrap<BigDecimal> w);

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	@JsonIgnore
	public void setPrice(String o) {
		this.price = Doll.staticSetPrice(siteRequest_, o);
	}
	public static BigDecimal staticSetPrice(SiteRequest siteRequest_, String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			return new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		return null;
	}
	@JsonIgnore
	public void setPrice(Double o) {
		setPrice(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setPrice(Integer o) {
		setPrice(new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	@JsonIgnore
	public void setPrice(Number o) {
		setPrice(new BigDecimal(o.doubleValue(), MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
	}
	protected Doll priceInit() {
		Wrap<BigDecimal> priceWrap = new Wrap<BigDecimal>().var("price");
		if(price == null) {
			_price(priceWrap);
			Optional.ofNullable(priceWrap.getO()).ifPresent(o -> {
				setPrice(o);
			});
		}
		return (Doll)this;
	}

	public static Double staticSearchPrice(SiteRequest siteRequest_, BigDecimal o) {
		return o == null ? null : o.doubleValue();
	}

	public static String staticSearchStrPrice(SiteRequest siteRequest_, Double o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPrice(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchPrice(siteRequest_, Doll.staticSetPrice(siteRequest_, o)).toString();
	}

	public BigDecimal sqlPrice() {
		return price;
	}

	////////////
	// pageId //
	////////////


	/**	 The entity pageId
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageId;

	/**	<br> The entity pageId
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:pageId">Find the entity pageId in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageId(Wrap<String> w);

	public String getPageId() {
		return pageId;
	}
	public void setPageId(String o) {
		this.pageId = Doll.staticSetPageId(siteRequest_, o);
	}
	public static String staticSetPageId(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll pageIdInit() {
		Wrap<String> pageIdWrap = new Wrap<String>().var("pageId");
		if(pageId == null) {
			_pageId(pageIdWrap);
			Optional.ofNullable(pageIdWrap.getO()).ifPresent(o -> {
				setPageId(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchPageId(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageId(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageId(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchPageId(siteRequest_, Doll.staticSetPageId(siteRequest_, o)).toString();
	}

	public String sqlPageId() {
		return pageId;
	}

	/////////////////
	// resourceUri //
	/////////////////


	/**	 The entity resourceUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String resourceUri;

	/**	<br> The entity resourceUri
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:resourceUri">Find the entity resourceUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _resourceUri(Wrap<String> w);

	public String getResourceUri() {
		return resourceUri;
	}
	public void setResourceUri(String o) {
		this.resourceUri = Doll.staticSetResourceUri(siteRequest_, o);
	}
	public static String staticSetResourceUri(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll resourceUriInit() {
		Wrap<String> resourceUriWrap = new Wrap<String>().var("resourceUri");
		if(resourceUri == null) {
			_resourceUri(resourceUriWrap);
			Optional.ofNullable(resourceUriWrap.getO()).ifPresent(o -> {
				setResourceUri(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchResourceUri(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrResourceUri(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqResourceUri(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchResourceUri(siteRequest_, Doll.staticSetResourceUri(siteRequest_, o)).toString();
	}

	public String sqlResourceUri() {
		return resourceUri;
	}

	/////////////////
	// templateUri //
	/////////////////


	/**	 The entity templateUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String templateUri;

	/**	<br> The entity templateUri
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:templateUri">Find the entity templateUri in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _templateUri(Wrap<String> w);

	public String getTemplateUri() {
		return templateUri;
	}
	public void setTemplateUri(String o) {
		this.templateUri = Doll.staticSetTemplateUri(siteRequest_, o);
	}
	public static String staticSetTemplateUri(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll templateUriInit() {
		Wrap<String> templateUriWrap = new Wrap<String>().var("templateUri");
		if(templateUri == null) {
			_templateUri(templateUriWrap);
			Optional.ofNullable(templateUriWrap.getO()).ifPresent(o -> {
				setTemplateUri(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchTemplateUri(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTemplateUri(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTemplateUri(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchTemplateUri(siteRequest_, Doll.staticSetTemplateUri(siteRequest_, o)).toString();
	}

	public String sqlTemplateUri() {
		return templateUri;
	}

	///////////////////
	// emailTemplate //
	///////////////////


	/**	 The entity emailTemplate
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String emailTemplate;

	/**	<br> The entity emailTemplate
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:emailTemplate">Find the entity emailTemplate in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _emailTemplate(Wrap<String> w);

	public String getEmailTemplate() {
		return emailTemplate;
	}
	public void setEmailTemplate(String o) {
		this.emailTemplate = Doll.staticSetEmailTemplate(siteRequest_, o);
	}
	public static String staticSetEmailTemplate(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll emailTemplateInit() {
		Wrap<String> emailTemplateWrap = new Wrap<String>().var("emailTemplate");
		if(emailTemplate == null) {
			_emailTemplate(emailTemplateWrap);
			Optional.ofNullable(emailTemplateWrap.getO()).ifPresent(o -> {
				setEmailTemplate(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchEmailTemplate(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrEmailTemplate(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqEmailTemplate(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchEmailTemplate(siteRequest_, Doll.staticSetEmailTemplate(siteRequest_, o)).toString();
	}

	public String sqlEmailTemplate() {
		return emailTemplate;
	}

	//////////////
	// storeUrl //
	//////////////


	/**	 The entity storeUrl
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String storeUrl;

	/**	<br> The entity storeUrl
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:storeUrl">Find the entity storeUrl in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _storeUrl(Wrap<String> w);

	public String getStoreUrl() {
		return storeUrl;
	}
	public void setStoreUrl(String o) {
		this.storeUrl = Doll.staticSetStoreUrl(siteRequest_, o);
	}
	public static String staticSetStoreUrl(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll storeUrlInit() {
		Wrap<String> storeUrlWrap = new Wrap<String>().var("storeUrl");
		if(storeUrl == null) {
			_storeUrl(storeUrlWrap);
			Optional.ofNullable(storeUrlWrap.getO()).ifPresent(o -> {
				setStoreUrl(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchStoreUrl(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrStoreUrl(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqStoreUrl(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchStoreUrl(siteRequest_, Doll.staticSetStoreUrl(siteRequest_, o)).toString();
	}

	public String sqlStoreUrl() {
		return storeUrl;
	}

	//////////////////
	// instagramUrl //
	//////////////////


	/**	 The entity instagramUrl
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String instagramUrl;

	/**	<br> The entity instagramUrl
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:instagramUrl">Find the entity instagramUrl in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _instagramUrl(Wrap<String> w);

	public String getInstagramUrl() {
		return instagramUrl;
	}
	public void setInstagramUrl(String o) {
		this.instagramUrl = Doll.staticSetInstagramUrl(siteRequest_, o);
	}
	public static String staticSetInstagramUrl(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll instagramUrlInit() {
		Wrap<String> instagramUrlWrap = new Wrap<String>().var("instagramUrl");
		if(instagramUrl == null) {
			_instagramUrl(instagramUrlWrap);
			Optional.ofNullable(instagramUrlWrap.getO()).ifPresent(o -> {
				setInstagramUrl(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchInstagramUrl(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrInstagramUrl(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqInstagramUrl(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchInstagramUrl(siteRequest_, Doll.staticSetInstagramUrl(siteRequest_, o)).toString();
	}

	public String sqlInstagramUrl() {
		return instagramUrl;
	}

	///////////
	// title //
	///////////


	/**	 The entity title
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String title;

	/**	<br> The entity title
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:title">Find the entity title in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _title(Wrap<String> w);

	public String getTitle() {
		return title;
	}
	public void setTitle(String o) {
		this.title = Doll.staticSetTitle(siteRequest_, o);
	}
	public static String staticSetTitle(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected Doll titleInit() {
		Wrap<String> titleWrap = new Wrap<String>().var("title");
		if(title == null) {
			_title(titleWrap);
			Optional.ofNullable(titleWrap.getO()).ifPresent(o -> {
				setTitle(o);
			});
		}
		return (Doll)this;
	}

	public static String staticSearchTitle(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrTitle(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqTitle(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchTitle(siteRequest_, Doll.staticSetTitle(siteRequest_, o)).toString();
	}

	public String sqlTitle() {
		return title;
	}

	////////////////
	// productNum //
	////////////////


	/**	 The entity productNum
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer productNum;

	/**	<br> The entity productNum
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.Doll&fq=entiteVar_enUS_indexed_string:productNum">Find the entity productNum in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _productNum(Wrap<Integer> w);

	public Integer getProductNum() {
		return productNum;
	}

	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}
	@JsonIgnore
	public void setProductNum(String o) {
		this.productNum = Doll.staticSetProductNum(siteRequest_, o);
	}
	public static Integer staticSetProductNum(SiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected Doll productNumInit() {
		Wrap<Integer> productNumWrap = new Wrap<Integer>().var("productNum");
		if(productNum == null) {
			_productNum(productNumWrap);
			Optional.ofNullable(productNumWrap.getO()).ifPresent(o -> {
				setProductNum(o);
			});
		}
		return (Doll)this;
	}

	public static Integer staticSearchProductNum(SiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrProductNum(SiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqProductNum(SiteRequest siteRequest_, String o) {
		return Doll.staticSearchProductNum(siteRequest_, Doll.staticSetProductNum(siteRequest_, o)).toString();
	}

	public Integer sqlProductNum() {
		return productNum;
	}

	//////////////
	// initDeep //
	//////////////

	public Future<DollGen<DEV>> promiseDeepDoll(SiteRequest siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepDoll();
	}

	public Future<DollGen<DEV>> promiseDeepDoll() {
		Promise<DollGen<DEV>> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseDoll(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseResult(siteRequest_).onSuccess(b -> {
				promise.complete(this);
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseDoll(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				nameInit();
				descriptionInit();
				priceInit();
				pageIdInit();
				resourceUriInit();
				templateUriInit();
				emailTemplateInit();
				storeUrlInit();
				instagramUrlInit();
				titleInit();
				productNumInit();
				promise2.complete();
			} catch(Exception ex) {
				promise2.fail(ex);
			}
			return promise2.future();
		}).onSuccess(a -> {
			promise.complete();
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	@Override public Future<? extends DollGen<DEV>> promiseDeepForClass(SiteRequest siteRequest_) {
		return promiseDeepDoll(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestDoll(SiteRequest siteRequest_) {
			super.siteRequestBaseResult(siteRequest_);
	}

	public void siteRequestForClass(SiteRequest siteRequest_) {
		siteRequestDoll(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainDoll(v);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.obtainForClass(v);
			}
			else if(o instanceof Map) {
				Map<?, ?> map = (Map<?, ?>)o;
				o = map.get(v);
			}
		}
		return o;
	}
	public Object obtainDoll(String var) {
		Doll oDoll = (Doll)this;
		switch(var) {
			case "name":
				return oDoll.name;
			case "description":
				return oDoll.description;
			case "price":
				return oDoll.price;
			case "pageId":
				return oDoll.pageId;
			case "resourceUri":
				return oDoll.resourceUri;
			case "templateUri":
				return oDoll.templateUri;
			case "emailTemplate":
				return oDoll.emailTemplate;
			case "storeUrl":
				return oDoll.storeUrl;
			case "instagramUrl":
				return oDoll.instagramUrl;
			case "title":
				return oDoll.title;
			case "productNum":
				return oDoll.productNum;
			default:
				return super.obtainBaseResult(var);
		}
	}

	///////////////
	// relate //
	///////////////

	@Override public boolean relateForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = relateDoll(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateDoll(String var, Object val) {
		Doll oDoll = (Doll)this;
		switch(var) {
			default:
				return super.relateBaseResult(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String v, Doll o) {
		return staticSetDoll(entityVar,  siteRequest_, v, o);
	}
	public static Object staticSetDoll(String entityVar, SiteRequest siteRequest_, String v, Doll o) {
		switch(entityVar) {
		case "name":
			return Doll.staticSetName(siteRequest_, v);
		case "description":
			return Doll.staticSetDescription(siteRequest_, v);
		case "price":
			return Doll.staticSetPrice(siteRequest_, v);
		case "pageId":
			return Doll.staticSetPageId(siteRequest_, v);
		case "resourceUri":
			return Doll.staticSetResourceUri(siteRequest_, v);
		case "templateUri":
			return Doll.staticSetTemplateUri(siteRequest_, v);
		case "emailTemplate":
			return Doll.staticSetEmailTemplate(siteRequest_, v);
		case "storeUrl":
			return Doll.staticSetStoreUrl(siteRequest_, v);
		case "instagramUrl":
			return Doll.staticSetInstagramUrl(siteRequest_, v);
		case "title":
			return Doll.staticSetTitle(siteRequest_, v);
		case "productNum":
			return Doll.staticSetProductNum(siteRequest_, v);
			default:
				return BaseResult.staticSetBaseResult(entityVar,  siteRequest_, v, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSearchDoll(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchDoll(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "name":
			return Doll.staticSearchName(siteRequest_, (String)o);
		case "description":
			return Doll.staticSearchDescription(siteRequest_, (String)o);
		case "price":
			return Doll.staticSearchPrice(siteRequest_, (BigDecimal)o);
		case "pageId":
			return Doll.staticSearchPageId(siteRequest_, (String)o);
		case "resourceUri":
			return Doll.staticSearchResourceUri(siteRequest_, (String)o);
		case "templateUri":
			return Doll.staticSearchTemplateUri(siteRequest_, (String)o);
		case "emailTemplate":
			return Doll.staticSearchEmailTemplate(siteRequest_, (String)o);
		case "storeUrl":
			return Doll.staticSearchStoreUrl(siteRequest_, (String)o);
		case "instagramUrl":
			return Doll.staticSearchInstagramUrl(siteRequest_, (String)o);
		case "title":
			return Doll.staticSearchTitle(siteRequest_, (String)o);
		case "productNum":
			return Doll.staticSearchProductNum(siteRequest_, (Integer)o);
			default:
				return BaseResult.staticSearchBaseResult(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSearchStrDoll(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrDoll(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "name":
			return Doll.staticSearchStrName(siteRequest_, (String)o);
		case "description":
			return Doll.staticSearchStrDescription(siteRequest_, (String)o);
		case "price":
			return Doll.staticSearchStrPrice(siteRequest_, (Double)o);
		case "pageId":
			return Doll.staticSearchStrPageId(siteRequest_, (String)o);
		case "resourceUri":
			return Doll.staticSearchStrResourceUri(siteRequest_, (String)o);
		case "templateUri":
			return Doll.staticSearchStrTemplateUri(siteRequest_, (String)o);
		case "emailTemplate":
			return Doll.staticSearchStrEmailTemplate(siteRequest_, (String)o);
		case "storeUrl":
			return Doll.staticSearchStrStoreUrl(siteRequest_, (String)o);
		case "instagramUrl":
			return Doll.staticSearchStrInstagramUrl(siteRequest_, (String)o);
		case "title":
			return Doll.staticSearchStrTitle(siteRequest_, (String)o);
		case "productNum":
			return Doll.staticSearchStrProductNum(siteRequest_, (Integer)o);
			default:
				return BaseResult.staticSearchStrBaseResult(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSearchFqDoll(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqDoll(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
		case "name":
			return Doll.staticSearchFqName(siteRequest_, o);
		case "description":
			return Doll.staticSearchFqDescription(siteRequest_, o);
		case "price":
			return Doll.staticSearchFqPrice(siteRequest_, o);
		case "pageId":
			return Doll.staticSearchFqPageId(siteRequest_, o);
		case "resourceUri":
			return Doll.staticSearchFqResourceUri(siteRequest_, o);
		case "templateUri":
			return Doll.staticSearchFqTemplateUri(siteRequest_, o);
		case "emailTemplate":
			return Doll.staticSearchFqEmailTemplate(siteRequest_, o);
		case "storeUrl":
			return Doll.staticSearchFqStoreUrl(siteRequest_, o);
		case "instagramUrl":
			return Doll.staticSearchFqInstagramUrl(siteRequest_, o);
		case "title":
			return Doll.staticSearchFqTitle(siteRequest_, o);
		case "productNum":
			return Doll.staticSearchFqProductNum(siteRequest_, o);
			default:
				return BaseResult.staticSearchFqBaseResult(entityVar,  siteRequest_, o);
		}
	}

	/////////////
	// persist //
	/////////////

	@Override public boolean persistForClass(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = persistDoll(v, val);
				else if(o instanceof BaseModel) {
					BaseModel oBaseModel = (BaseModel)o;
					o = oBaseModel.persistForClass(v, val);
				}
			}
		}
		return o != null;
	}
	public Object persistDoll(String var, Object val) {
		String varLower = var.toLowerCase();
			if("name".equals(varLower)) {
				if(val instanceof String) {
					setName((String)val);
				}
				saves.add("name");
				return val;
			} else if("description".equals(varLower)) {
				if(val instanceof String) {
					setDescription((String)val);
				}
				saves.add("description");
				return val;
			} else if("price".equals(varLower)) {
				if(val instanceof String) {
					setPrice((String)val);
				} else if(val instanceof Number) {
					setPrice(new BigDecimal(((Number)val).doubleValue()));
				}
				saves.add("price");
				return val;
			} else if("pageid".equals(varLower)) {
				if(val instanceof String) {
					setPageId((String)val);
				}
				saves.add("pageId");
				return val;
			} else if("resourceuri".equals(varLower)) {
				if(val instanceof String) {
					setResourceUri((String)val);
				}
				saves.add("resourceUri");
				return val;
			} else if("templateuri".equals(varLower)) {
				if(val instanceof String) {
					setTemplateUri((String)val);
				}
				saves.add("templateUri");
				return val;
			} else if("emailtemplate".equals(varLower)) {
				if(val instanceof String) {
					setEmailTemplate((String)val);
				}
				saves.add("emailTemplate");
				return val;
			} else if("storeurl".equals(varLower)) {
				if(val instanceof String) {
					setStoreUrl((String)val);
				}
				saves.add("storeUrl");
				return val;
			} else if("instagramurl".equals(varLower)) {
				if(val instanceof String) {
					setInstagramUrl((String)val);
				}
				saves.add("instagramUrl");
				return val;
			} else if("title".equals(varLower)) {
				if(val instanceof String) {
					setTitle((String)val);
				}
				saves.add("title");
				return val;
			} else if("productnum".equals(varLower)) {
				if(val instanceof Integer) {
					setProductNum((Integer)val);
				} else {
					setProductNum(val == null ? null : val.toString());
				}
				saves.add("productNum");
				return val;
		} else {
			return super.persistBaseResult(var, val);
		}
	}

	/////////////
	// populate //
	/////////////

	@Override public void populateForClass(SolrResponse.Doc doc) {
		populateDoll(doc);
	}
	public void populateDoll(SolrResponse.Doc doc) {
		Doll oDoll = (Doll)this;
		saves = Optional.ofNullable((ArrayList<String>)doc.get("saves_docvalues_strings")).orElse(new ArrayList<String>());
		if(saves != null) {

			if(saves.contains("name")) {
				String name = (String)doc.get("name_docvalues_string");
				if(name != null)
					oDoll.setName(name);
			}

			if(saves.contains("description")) {
				String description = (String)doc.get("description_docvalues_string");
				if(description != null)
					oDoll.setDescription(description);
			}

			if(saves.contains("price")) {
				Double price = (Double)doc.get("price_docvalues_double");
				if(price != null)
					oDoll.setPrice(price);
			}

			if(saves.contains("pageId")) {
				String pageId = (String)doc.get("pageId_docvalues_string");
				if(pageId != null)
					oDoll.setPageId(pageId);
			}

			if(saves.contains("resourceUri")) {
				String resourceUri = (String)doc.get("resourceUri_docvalues_string");
				if(resourceUri != null)
					oDoll.setResourceUri(resourceUri);
			}

			if(saves.contains("templateUri")) {
				String templateUri = (String)doc.get("templateUri_docvalues_string");
				if(templateUri != null)
					oDoll.setTemplateUri(templateUri);
			}

			if(saves.contains("emailTemplate")) {
				String emailTemplate = (String)doc.get("emailTemplate_docvalues_string");
				if(emailTemplate != null)
					oDoll.setEmailTemplate(emailTemplate);
			}

			if(saves.contains("storeUrl")) {
				String storeUrl = (String)doc.get("storeUrl_docvalues_string");
				if(storeUrl != null)
					oDoll.setStoreUrl(storeUrl);
			}

			if(saves.contains("instagramUrl")) {
				String instagramUrl = (String)doc.get("instagramUrl_docvalues_string");
				if(instagramUrl != null)
					oDoll.setInstagramUrl(instagramUrl);
			}

			if(saves.contains("title")) {
				String title = (String)doc.get("title_docvalues_string");
				if(title != null)
					oDoll.setTitle(title);
			}

			if(saves.contains("productNum")) {
				Integer productNum = (Integer)doc.get("productNum_docvalues_int");
				if(productNum != null)
					oDoll.setProductNum(productNum);
			}
		}

		super.populateBaseResult(doc);
	}

	public void indexDoll(JsonObject doc) {
		if(name != null) {
			doc.put("name_docvalues_string", name);
		}
		if(description != null) {
			doc.put("description_docvalues_string", description);
		}
		if(price != null) {
			doc.put("price_docvalues_double", price.doubleValue());
		}
		if(pageId != null) {
			doc.put("pageId_docvalues_string", pageId);
		}
		if(resourceUri != null) {
			doc.put("resourceUri_docvalues_string", resourceUri);
		}
		if(templateUri != null) {
			doc.put("templateUri_docvalues_string", templateUri);
		}
		if(emailTemplate != null) {
			doc.put("emailTemplate_docvalues_string", emailTemplate);
		}
		if(storeUrl != null) {
			doc.put("storeUrl_docvalues_string", storeUrl);
		}
		if(instagramUrl != null) {
			doc.put("instagramUrl_docvalues_string", instagramUrl);
		}
		if(title != null) {
			doc.put("title_docvalues_string", title);
		}
		if(productNum != null) {
			doc.put("productNum_docvalues_int", productNum);
		}
		super.indexBaseResult(doc);

	}

	public static String varStoredDoll(String entityVar) {
		switch(entityVar) {
			case "name":
				return "name_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "price":
				return "price_docvalues_double";
			case "pageId":
				return "pageId_docvalues_string";
			case "resourceUri":
				return "resourceUri_docvalues_string";
			case "templateUri":
				return "templateUri_docvalues_string";
			case "emailTemplate":
				return "emailTemplate_docvalues_string";
			case "storeUrl":
				return "storeUrl_docvalues_string";
			case "instagramUrl":
				return "instagramUrl_docvalues_string";
			case "title":
				return "title_docvalues_string";
			case "productNum":
				return "productNum_docvalues_int";
			default:
				return BaseResult.varStoredBaseResult(entityVar);
		}
	}

	public static String varIndexedDoll(String entityVar) {
		switch(entityVar) {
			case "name":
				return "name_docvalues_string";
			case "description":
				return "description_docvalues_string";
			case "price":
				return "price_docvalues_double";
			case "pageId":
				return "pageId_docvalues_string";
			case "resourceUri":
				return "resourceUri_docvalues_string";
			case "templateUri":
				return "templateUri_docvalues_string";
			case "emailTemplate":
				return "emailTemplate_docvalues_string";
			case "storeUrl":
				return "storeUrl_docvalues_string";
			case "instagramUrl":
				return "instagramUrl_docvalues_string";
			case "title":
				return "title_docvalues_string";
			case "productNum":
				return "productNum_docvalues_int";
			default:
				return BaseResult.varIndexedBaseResult(entityVar);
		}
	}

	public static String searchVarDoll(String searchVar) {
		switch(searchVar) {
			case "name_docvalues_string":
				return "name";
			case "description_docvalues_string":
				return "description";
			case "price_docvalues_double":
				return "price";
			case "pageId_docvalues_string":
				return "pageId";
			case "resourceUri_docvalues_string":
				return "resourceUri";
			case "templateUri_docvalues_string":
				return "templateUri";
			case "emailTemplate_docvalues_string":
				return "emailTemplate";
			case "storeUrl_docvalues_string":
				return "storeUrl";
			case "instagramUrl_docvalues_string":
				return "instagramUrl";
			case "title_docvalues_string":
				return "title";
			case "productNum_docvalues_int":
				return "productNum";
			default:
				return BaseResult.searchVarBaseResult(searchVar);
		}
	}

	public static String varSearchDoll(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSearchBaseResult(entityVar);
		}
	}

	public static String varSuggestedDoll(String entityVar) {
		switch(entityVar) {
			default:
				return BaseResult.varSuggestedBaseResult(entityVar);
		}
	}

	/////////////
	// store //
	/////////////

	@Override public void storeForClass(SolrResponse.Doc doc) {
		storeDoll(doc);
	}
	public void storeDoll(SolrResponse.Doc doc) {
		Doll oDoll = (Doll)this;
		SiteRequest siteRequest = oDoll.getSiteRequest_();

		oDoll.setName(Optional.ofNullable(doc.get("name_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setDescription(Optional.ofNullable(doc.get("description_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setPrice(Optional.ofNullable(doc.get("price_docvalues_double")).map(v -> v.toString()).orElse(null));
		oDoll.setPageId(Optional.ofNullable(doc.get("pageId_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setResourceUri(Optional.ofNullable(doc.get("resourceUri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setTemplateUri(Optional.ofNullable(doc.get("templateUri_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setEmailTemplate(Optional.ofNullable(doc.get("emailTemplate_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setStoreUrl(Optional.ofNullable(doc.get("storeUrl_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setInstagramUrl(Optional.ofNullable(doc.get("instagramUrl_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setTitle(Optional.ofNullable(doc.get("title_docvalues_string")).map(v -> v.toString()).orElse(null));
		oDoll.setProductNum(Optional.ofNullable(doc.get("productNum_docvalues_int")).map(v -> v.toString()).orElse(null));

		super.storeBaseResult(doc);
	}

	//////////////////
	// apiRequest //
	//////////////////

	public void apiRequestDoll() {
		ApiRequest apiRequest = Optional.ofNullable(siteRequest_).map(r -> r.getApiRequest_()).orElse(null);
		Object o = Optional.ofNullable(apiRequest).map(ApiRequest::getOriginal).orElse(null);
		if(o != null && o instanceof Doll) {
			Doll original = (Doll)o;
			if(!Objects.equals(name, original.getName()))
				apiRequest.addVars("name");
			if(!Objects.equals(description, original.getDescription()))
				apiRequest.addVars("description");
			if(!Objects.equals(price, original.getPrice()) && price != null && original.getPrice() != null && price.compareTo(original.getPrice()) != 0)
				apiRequest.addVars("price");
			if(!Objects.equals(pageId, original.getPageId()))
				apiRequest.addVars("pageId");
			if(!Objects.equals(resourceUri, original.getResourceUri()))
				apiRequest.addVars("resourceUri");
			if(!Objects.equals(templateUri, original.getTemplateUri()))
				apiRequest.addVars("templateUri");
			if(!Objects.equals(emailTemplate, original.getEmailTemplate()))
				apiRequest.addVars("emailTemplate");
			if(!Objects.equals(storeUrl, original.getStoreUrl()))
				apiRequest.addVars("storeUrl");
			if(!Objects.equals(instagramUrl, original.getInstagramUrl()))
				apiRequest.addVars("instagramUrl");
			if(!Objects.equals(title, original.getTitle()))
				apiRequest.addVars("title");
			if(!Objects.equals(productNum, original.getProductNum()))
				apiRequest.addVars("productNum");
			super.apiRequestBaseResult();
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append(Optional.ofNullable(name).map(v -> "name: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(description).map(v -> "description: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(price).map(v -> "price: " + v + "\n").orElse(""));
		sb.append(Optional.ofNullable(pageId).map(v -> "pageId: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(resourceUri).map(v -> "resourceUri: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(templateUri).map(v -> "templateUri: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(emailTemplate).map(v -> "emailTemplate: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(storeUrl).map(v -> "storeUrl: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(instagramUrl).map(v -> "instagramUrl: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(title).map(v -> "title: \"" + v + "\"\n" ).orElse(""));
		sb.append(Optional.ofNullable(productNum).map(v -> "productNum: " + v + "\n").orElse(""));
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "Doll";
	public static final String CLASS_CANONICAL_NAME = "com.coralberryfairy.site.model.doll.Doll";
	public static final String CLASS_AUTH_RESOURCE = "DOLL";
	public static final String CLASS_API_ADDRESS_Doll = "coralberryfairy-enUS-Doll";
	public static String getClassApiAddress() {
		return CLASS_API_ADDRESS_Doll;
	}
	public static final String VAR_name = "name";
	public static final String VAR_description = "description";
	public static final String VAR_price = "price";
	public static final String VAR_pageId = "pageId";
	public static final String VAR_resourceUri = "resourceUri";
	public static final String VAR_templateUri = "templateUri";
	public static final String VAR_emailTemplate = "emailTemplate";
	public static final String VAR_storeUrl = "storeUrl";
	public static final String VAR_instagramUrl = "instagramUrl";
	public static final String VAR_title = "title";
	public static final String VAR_productNum = "productNum";

	public static List<String> varsQForClass() {
		return Doll.varsQDoll(new ArrayList<String>());
	}
	public static List<String> varsQDoll(List<String> vars) {
		BaseResult.varsQBaseResult(vars);
		return vars;
	}

	public static List<String> varsFqForClass() {
		return Doll.varsFqDoll(new ArrayList<String>());
	}
	public static List<String> varsFqDoll(List<String> vars) {
		vars.add(VAR_name);
		vars.add(VAR_description);
		vars.add(VAR_price);
		vars.add(VAR_pageId);
		vars.add(VAR_resourceUri);
		vars.add(VAR_templateUri);
		vars.add(VAR_emailTemplate);
		vars.add(VAR_storeUrl);
		vars.add(VAR_instagramUrl);
		vars.add(VAR_productNum);
		BaseResult.varsFqBaseResult(vars);
		return vars;
	}

	public static List<String> varsRangeForClass() {
		return Doll.varsRangeDoll(new ArrayList<String>());
	}
	public static List<String> varsRangeDoll(List<String> vars) {
		vars.add(VAR_price);
		vars.add(VAR_productNum);
		BaseResult.varsRangeBaseResult(vars);
		return vars;
	}

	public static final String DISPLAY_NAME_name = "Name";
	public static final String DISPLAY_NAME_description = "product description";
	public static final String DISPLAY_NAME_price = "price";
	public static final String DISPLAY_NAME_pageId = "Page ID";
	public static final String DISPLAY_NAME_resourceUri = "resource URI";
	public static final String DISPLAY_NAME_templateUri = "template URI";
	public static final String DISPLAY_NAME_emailTemplate = "email template";
	public static final String DISPLAY_NAME_storeUrl = "store URL";
	public static final String DISPLAY_NAME_instagramUrl = "Instagram URL";
	public static final String DISPLAY_NAME_title = "title";
	public static final String DISPLAY_NAME_productNum = "Product Number";

	@Override
	public String idForClass() {
		return pageId;
	}

	@Override
	public String titleForClass() {
		return objectTitle;
	}

	@Override
	public String nameForClass() {
		return name;
	}

	@Override
	public String classNameAdjectiveSingularForClass() {
		return Doll.NameAdjectiveSingular_enUS;
	}

	@Override
	public String descriptionForClass() {
		return description;
	}

	@Override
	public String classStringFormatUrlEditPageForClass() {
		return "%s/edit/product/doll/%s";
	}

	@Override
	public String classStringFormatUrlDisplayPageForClass() {
		return "%s/view/product/doll/%s";
	}

	@Override
	public String classStringFormatUrlUserPageForClass() {
		return null;
	}

	@Override
	public String classStringFormatUrlDownloadForClass() {
		return null;
	}

	public static String displayNameForClass(String var) {
		return Doll.displayNameDoll(var);
	}
	public static String displayNameDoll(String var) {
		switch(var) {
		case VAR_name:
			return DISPLAY_NAME_name;
		case VAR_description:
			return DISPLAY_NAME_description;
		case VAR_price:
			return DISPLAY_NAME_price;
		case VAR_pageId:
			return DISPLAY_NAME_pageId;
		case VAR_resourceUri:
			return DISPLAY_NAME_resourceUri;
		case VAR_templateUri:
			return DISPLAY_NAME_templateUri;
		case VAR_emailTemplate:
			return DISPLAY_NAME_emailTemplate;
		case VAR_storeUrl:
			return DISPLAY_NAME_storeUrl;
		case VAR_instagramUrl:
			return DISPLAY_NAME_instagramUrl;
		case VAR_title:
			return DISPLAY_NAME_title;
		case VAR_productNum:
			return DISPLAY_NAME_productNum;
		default:
			return BaseResult.displayNameBaseResult(var);
		}
	}

	public static String descriptionDoll(String var) {
		if(var == null)
			return null;
		switch(var) {
		case VAR_name:
			return "A descriptive name for the doll";
		case VAR_description:
			return "The product description. ";
		case VAR_price:
			return "The price of the product.";
		case VAR_pageId:
			return "The ID for this page. ";
		case VAR_resourceUri:
			return "The resource relative URI for this page. ";
		case VAR_templateUri:
			return "The template relative URI for this page. ";
		case VAR_emailTemplate:
			return "The HTML email template for this product. ";
		case VAR_storeUrl:
			return "The store URL for this page. ";
		case VAR_instagramUrl:
			return "The Instagram URL for this page. ";
		case VAR_title:
			return "The title of this page. ";
		case VAR_productNum:
			return "The product number for this page. ";
			default:
				return BaseResult.descriptionBaseResult(var);
		}
	}

	public static String classSimpleNameDoll(String var) {
		switch(var) {
		case VAR_name:
			return "String";
		case VAR_description:
			return "String";
		case VAR_price:
			return "BigDecimal";
		case VAR_pageId:
			return "String";
		case VAR_resourceUri:
			return "String";
		case VAR_templateUri:
			return "String";
		case VAR_emailTemplate:
			return "String";
		case VAR_storeUrl:
			return "String";
		case VAR_instagramUrl:
			return "String";
		case VAR_title:
			return "String";
		case VAR_productNum:
			return "Integer";
			default:
				return BaseResult.classSimpleNameBaseResult(var);
		}
	}

	public static Integer htmColumnDoll(String var) {
		switch(var) {
		case VAR_name:
			return 1;
		case VAR_description:
			return 2;
			default:
				return BaseResult.htmColumnBaseResult(var);
		}
	}

	public static Integer htmRowDoll(String var) {
		switch(var) {
		case VAR_name:
			return 3;
		case VAR_description:
			return 3;
		case VAR_price:
			return 3;
		case VAR_pageId:
			return 99;
			default:
				return BaseResult.htmRowBaseResult(var);
		}
	}

	public static Integer htmCellDoll(String var) {
		switch(var) {
		case VAR_name:
			return 1;
		case VAR_description:
			return 2;
		case VAR_price:
			return 3;
		case VAR_pageId:
			return 1;
			default:
				return BaseResult.htmCellBaseResult(var);
		}
	}

	public static Integer lengthMinDoll(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMinBaseResult(var);
		}
	}

	public static Integer lengthMaxDoll(String var) {
		switch(var) {
			default:
				return BaseResult.lengthMaxBaseResult(var);
		}
	}

	public static Integer maxDoll(String var) {
		switch(var) {
			default:
				return BaseResult.maxBaseResult(var);
		}
	}

	public static Integer minDoll(String var) {
		switch(var) {
			default:
				return BaseResult.minBaseResult(var);
		}
	}
}
