package com.coralberryfairy.site.model.doll;

import com.coralberryfairy.site.request.SiteRequest;
import com.coralberryfairy.site.result.BaseResultPage;
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
import org.computate.vertx.search.list.SearchList;
import com.coralberryfairy.site.model.doll.Doll;
import java.lang.String;
import org.computate.search.response.solr.SolrResponse.Stats;
import org.computate.search.response.solr.SolrResponse.FacetCounts;
import io.vertx.core.json.JsonObject;
import java.time.ZoneId;
import java.util.Locale;
import java.lang.Long;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.lang.Integer;
import java.math.BigDecimal;
import io.vertx.core.json.JsonArray;
import java.lang.Void;
import org.computate.search.wrap.Wrap;
import io.vertx.core.Promise;
import io.vertx.core.Future;

/**
 * <ol>
<h3>Suggestions that can generate more code for you: </h3> * </ol>
 * <li>You can add a class comment <b>"Api: true"</b> if you wish to GET, POST, PATCH or PUT these DollGenPage objects in a RESTful API. 
 * </li><li>You can add a class comment "{@inheritDoc}" if you wish to inherit the helpful inherited class comments from class DollGenPageGen into the class DollGenPage. 
 * </li>
 * <h3>About the DollGenPage class and it's generated class DollGenPageGen&lt;BaseResultPage&gt;: </h3>extends DollGenPageGen
 * <p>
 * This Java class extends a generated Java class DollGenPageGen built by the <a href="https://github.com/computate-org/computate">https://github.com/computate-org/computate</a> project. 
 * Whenever this Java class is modified or touched, the watch service installed as described in the README, indexes all the information about this Java class in a local Apache Solr Search Engine. 
 * If you are running the service, you can see the indexed data about this Java Class here: 
 * </p>
 * <p><a href="https://solr.apps-crc.testing/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage">Find the class DollGenPage in Solr. </a></p>
 * <p>
 * The extended class ending with "Gen" did not exist at first, but was automatically created by the same watch service based on the data retrieved from the local Apache Server search engine. 
 * The extended class contains many generated fields, getters, setters, initialization code, and helper methods to help build a website and API fast, reactive, and scalable. 
 * </p>
 * extends DollGenPageGen<BaseResultPage>
 * <p>This <code>class DollGenPage extends DollGenPageGen&lt;BaseResultPage&gt;</code>, which means it extends a newly generated DollGenPageGen. 
 * The generated <code>class DollGenPageGen extends BaseResultPage</code> which means that DollGenPage extends DollGenPageGen which extends BaseResultPage. 
 * This generated inheritance is a powerful feature that allows a lot of boiler plate code to be created for you automatically while still preserving inheritance through the power of Java Generic classes. 
 * </p>
 * <h2>Api: true</h2>
 * <h2>ApiTag.enUS: true</h2>
 * <h2>ApiUri.enUS: null</h2>
 * <h2>Color: null</h2>
 * <h2>Indexed: true</h2>
 * <h2>{@inheritDoc}</h2>
 * <p>By adding a class comment "{@inheritDoc}", the DollGenPage class will inherit the helpful inherited class comments from the super class DollGenPageGen. 
 * </p>
 * <h2>Rows: null</h2>
 * <h2>Model: true</h2>
 * <h2>Page: true</h2>
 * <h2>SuperPage.enUS: null</h2>
 * <h2>Promise: true</h2>
 * <p>
 *   This class contains a comment <b>"Promise: true"</b>
 *   Sometimes a Java class must be initialized asynchronously when it involves calling a blocking API. 
 *   This means that the DollGenPage Java class has promiseDeep methods which must be initialized asynchronously as a Vert.x Promise  instead of initDeep methods which are a simple non-asynchronous method. 
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
 * <h2>AName.enUS: null</h2>
 * <p>
 * Delete the class DollGenPage in Solr: 
 * curl -k 'https://solr.apps-crc.testing/update?commitWithin=1000&overwrite=true&wt=json' -X POST -H 'Content-type: text/xml' --data-raw '&lt;add&gt;&lt;delete&gt;&lt;query&gt;classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&lt;/query&gt;&lt;/delete&gt;&lt;/add&gt;'
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
public abstract class DollGenPageGen<DEV> extends BaseResultPage {
	protected static final Logger LOG = LoggerFactory.getLogger(DollGenPage.class);

	/////////////////////
	// searchListDoll_ //
	/////////////////////


	/**	 The entity searchListDoll_
	 *	 is defined as null before being initialized. 
	 */
	@JsonIgnore
	@JsonInclude(Include.NON_NULL)
	protected SearchList<Doll> searchListDoll_;

	/**	<br> The entity searchListDoll_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:searchListDoll_">Find the entity searchListDoll_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _searchListDoll_(Wrap<SearchList<Doll>> w);

	public SearchList<Doll> getSearchListDoll_() {
		return searchListDoll_;
	}

	public void setSearchListDoll_(SearchList<Doll> searchListDoll_) {
		this.searchListDoll_ = searchListDoll_;
	}
	public static SearchList<Doll> staticSetSearchListDoll_(SiteRequest siteRequest_, String o) {
		return null;
	}
	protected DollGenPage searchListDoll_Init() {
		Wrap<SearchList<Doll>> searchListDoll_Wrap = new Wrap<SearchList<Doll>>().var("searchListDoll_");
		if(searchListDoll_ == null) {
			_searchListDoll_(searchListDoll_Wrap);
			Optional.ofNullable(searchListDoll_Wrap.getO()).ifPresent(o -> {
				setSearchListDoll_(o);
			});
		}
		return (DollGenPage)this;
	}

	//////////////
	// listDoll //
	//////////////


	/**	 The entity listDoll
	 *	 It is constructed before being initialized with the constructor by default. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected JsonArray listDoll = new JsonArray();

	/**	<br> The entity listDoll
	 *  It is constructed before being initialized with the constructor by default. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:listDoll">Find the entity listDoll in Solr</a>
	 * <br>
	 * @param l is the entity already constructed. 
	 **/
	protected abstract void _listDoll(JsonArray l);

	public JsonArray getListDoll() {
		return listDoll;
	}

	public void setListDoll(JsonArray listDoll) {
		this.listDoll = listDoll;
	}
	@JsonIgnore
	public void setListDoll(String o) {
		this.listDoll = DollGenPage.staticSetListDoll(siteRequest_, o);
	}
	public static JsonArray staticSetListDoll(SiteRequest siteRequest_, String o) {
		if(o != null) {
				return new JsonArray(o);
		}
		return null;
	}
	protected DollGenPage listDollInit() {
		_listDoll(listDoll);
		return (DollGenPage)this;
	}

	public static String staticSearchListDoll(SiteRequest siteRequest_, JsonArray o) {
		return o.toString();
	}

	public static String staticSearchStrListDoll(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqListDoll(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchListDoll(siteRequest_, DollGenPage.staticSetListDoll(siteRequest_, o)).toString();
	}

	///////////////
	// dollCount //
	///////////////


	/**	 The entity dollCount
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer dollCount;

	/**	<br> The entity dollCount
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:dollCount">Find the entity dollCount in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _dollCount(Wrap<Integer> w);

	public Integer getDollCount() {
		return dollCount;
	}

	public void setDollCount(Integer dollCount) {
		this.dollCount = dollCount;
	}
	@JsonIgnore
	public void setDollCount(String o) {
		this.dollCount = DollGenPage.staticSetDollCount(siteRequest_, o);
	}
	public static Integer staticSetDollCount(SiteRequest siteRequest_, String o) {
		if(NumberUtils.isParsable(o))
			return Integer.parseInt(o);
		return null;
	}
	protected DollGenPage dollCountInit() {
		Wrap<Integer> dollCountWrap = new Wrap<Integer>().var("dollCount");
		if(dollCount == null) {
			_dollCount(dollCountWrap);
			Optional.ofNullable(dollCountWrap.getO()).ifPresent(o -> {
				setDollCount(o);
			});
		}
		return (DollGenPage)this;
	}

	public static Integer staticSearchDollCount(SiteRequest siteRequest_, Integer o) {
		return o;
	}

	public static String staticSearchStrDollCount(SiteRequest siteRequest_, Integer o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqDollCount(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchDollCount(siteRequest_, DollGenPage.staticSetDollCount(siteRequest_, o)).toString();
	}

	///////////
	// doll_ //
	///////////


	/**	 The entity doll_
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected Doll doll_;

	/**	<br> The entity doll_
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:doll_">Find the entity doll_ in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _doll_(Wrap<Doll> w);

	public Doll getDoll_() {
		return doll_;
	}

	public void setDoll_(Doll doll_) {
		this.doll_ = doll_;
	}
	public static Doll staticSetDoll_(SiteRequest siteRequest_, String o) {
		return null;
	}
	protected DollGenPage doll_Init() {
		Wrap<Doll> doll_Wrap = new Wrap<Doll>().var("doll_");
		if(doll_ == null) {
			_doll_(doll_Wrap);
			Optional.ofNullable(doll_Wrap.getO()).ifPresent(o -> {
				setDoll_(o);
			});
		}
		return (DollGenPage)this;
	}

	////////
	// id //
	////////


	/**	 The entity id
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String id;

	/**	<br> The entity id
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:id">Find the entity id in Solr</a>
	 * <br>
	 * @param w is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _id(Wrap<String> w);

	public String getId() {
		return id;
	}
	public void setId(String o) {
		this.id = DollGenPage.staticSetId(siteRequest_, o);
	}
	public static String staticSetId(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected DollGenPage idInit() {
		Wrap<String> idWrap = new Wrap<String>().var("id");
		if(id == null) {
			_id(idWrap);
			Optional.ofNullable(idWrap.getO()).ifPresent(o -> {
				setId(o);
			});
		}
		return (DollGenPage)this;
	}

	public static String staticSearchId(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrId(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqId(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchId(siteRequest_, DollGenPage.staticSetId(siteRequest_, o)).toString();
	}

	/////////////////
	// pageUriDoll //
	/////////////////


	/**	 The entity pageUriDoll
	 *	 is defined as null before being initialized. 
	 */
	@JsonProperty
	@JsonInclude(Include.NON_NULL)
	protected String pageUriDoll;

	/**	<br> The entity pageUriDoll
	 *  is defined as null before being initialized. 
	 * <br><a href="https://solr.apps-crc.testing/solr/#/computate/query?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:com.coralberryfairy.site.model.doll.DollGenPage&fq=entiteVar_enUS_indexed_string:pageUriDoll">Find the entity pageUriDoll in Solr</a>
	 * <br>
	 * @param c is for wrapping a value to assign to this entity during initialization. 
	 **/
	protected abstract void _pageUriDoll(Wrap<String> c);

	public String getPageUriDoll() {
		return pageUriDoll;
	}
	public void setPageUriDoll(String o) {
		this.pageUriDoll = DollGenPage.staticSetPageUriDoll(siteRequest_, o);
	}
	public static String staticSetPageUriDoll(SiteRequest siteRequest_, String o) {
		return o;
	}
	protected DollGenPage pageUriDollInit() {
		Wrap<String> pageUriDollWrap = new Wrap<String>().var("pageUriDoll");
		if(pageUriDoll == null) {
			_pageUriDoll(pageUriDollWrap);
			Optional.ofNullable(pageUriDollWrap.getO()).ifPresent(o -> {
				setPageUriDoll(o);
			});
		}
		return (DollGenPage)this;
	}

	public static String staticSearchPageUriDoll(SiteRequest siteRequest_, String o) {
		return o;
	}

	public static String staticSearchStrPageUriDoll(SiteRequest siteRequest_, String o) {
		return o == null ? null : o.toString();
	}

	public static String staticSearchFqPageUriDoll(SiteRequest siteRequest_, String o) {
		return DollGenPage.staticSearchPageUriDoll(siteRequest_, DollGenPage.staticSetPageUriDoll(siteRequest_, o)).toString();
	}

	//////////////
	// initDeep //
	//////////////

	public Future<Void> promiseDeepDollGenPage(SiteRequest siteRequest_) {
		setSiteRequest_(siteRequest_);
		return promiseDeepDollGenPage();
	}

	public Future<Void> promiseDeepDollGenPage() {
		Promise<Void> promise = Promise.promise();
		Promise<Void> promise2 = Promise.promise();
		promiseDollGenPage(promise2);
		promise2.future().onSuccess(a -> {
			super.promiseDeepBaseResultPage(siteRequest_).onSuccess(b -> {
				promise.complete();
			}).onFailure(ex -> {
				promise.fail(ex);
			});
		}).onFailure(ex -> {
			promise.fail(ex);
		});
		return promise.future();
	}

	public Future<Void> promiseDollGenPage(Promise<Void> promise) {
		Future.future(a -> a.complete()).compose(a -> {
			Promise<Void> promise2 = Promise.promise();
			try {
				searchListDoll_Init();
				listDollInit();
				dollCountInit();
				doll_Init();
				idInit();
				pageUriDollInit();
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

	@Override public Future<Void> promiseDeepForClass(SiteRequest siteRequest_) {
		return promiseDeepDollGenPage(siteRequest_);
	}

	/////////////////
	// siteRequest //
	/////////////////

	public void siteRequestDollGenPage(SiteRequest siteRequest_) {
			super.siteRequestBaseResultPage(siteRequest_);
	}

	public void siteRequestForClass(SiteRequest siteRequest_) {
		siteRequestDollGenPage(siteRequest_);
	}

	/////////////
	// obtain //
	/////////////

	@Override public Object obtainForClass(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtainDollGenPage(v);
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
	public Object obtainDollGenPage(String var) {
		DollGenPage oDollGenPage = (DollGenPage)this;
		switch(var) {
			case "searchListDoll_":
				return oDollGenPage.searchListDoll_;
			case "listDoll":
				return oDollGenPage.listDoll;
			case "dollCount":
				return oDollGenPage.dollCount;
			case "doll_":
				return oDollGenPage.doll_;
			case "id":
				return oDollGenPage.id;
			case "pageUriDoll":
				return oDollGenPage.pageUriDoll;
			default:
				return super.obtainBaseResultPage(var);
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
				o = relateDollGenPage(v, val);
			else if(o instanceof BaseModel) {
				BaseModel baseModel = (BaseModel)o;
				o = baseModel.relateForClass(v, val);
			}
		}
		return o != null;
	}
	public Object relateDollGenPage(String var, Object val) {
		DollGenPage oDollGenPage = (DollGenPage)this;
		switch(var) {
			default:
				return super.relateBaseResultPage(var, val);
		}
	}

	///////////////
	// staticSet //
	///////////////

	public static Object staticSetForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSetDollGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSetDollGenPage(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSetListDoll(siteRequest_, o);
		case "dollCount":
			return DollGenPage.staticSetDollCount(siteRequest_, o);
		case "id":
			return DollGenPage.staticSetId(siteRequest_, o);
		case "pageUriDoll":
			return DollGenPage.staticSetPageUriDoll(siteRequest_, o);
			default:
				return BaseResultPage.staticSetBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	////////////////
	// staticSearch //
	////////////////

	public static Object staticSearchForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSearchDollGenPage(entityVar,  siteRequest_, o);
	}
	public static Object staticSearchDollGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSearchListDoll(siteRequest_, (JsonArray)o);
		case "dollCount":
			return DollGenPage.staticSearchDollCount(siteRequest_, (Integer)o);
		case "id":
			return DollGenPage.staticSearchId(siteRequest_, (String)o);
		case "pageUriDoll":
			return DollGenPage.staticSearchPageUriDoll(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	///////////////////
	// staticSearchStr //
	///////////////////

	public static String staticSearchStrForClass(String entityVar, SiteRequest siteRequest_, Object o) {
		return staticSearchStrDollGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchStrDollGenPage(String entityVar, SiteRequest siteRequest_, Object o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSearchStrListDoll(siteRequest_, (String)o);
		case "dollCount":
			return DollGenPage.staticSearchStrDollCount(siteRequest_, (Integer)o);
		case "id":
			return DollGenPage.staticSearchStrId(siteRequest_, (String)o);
		case "pageUriDoll":
			return DollGenPage.staticSearchStrPageUriDoll(siteRequest_, (String)o);
			default:
				return BaseResultPage.staticSearchStrBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////////
	// staticSearchFq //
	//////////////////

	public static String staticSearchFqForClass(String entityVar, SiteRequest siteRequest_, String o) {
		return staticSearchFqDollGenPage(entityVar,  siteRequest_, o);
	}
	public static String staticSearchFqDollGenPage(String entityVar, SiteRequest siteRequest_, String o) {
		switch(entityVar) {
		case "listDoll":
			return DollGenPage.staticSearchFqListDoll(siteRequest_, o);
		case "dollCount":
			return DollGenPage.staticSearchFqDollCount(siteRequest_, o);
		case "id":
			return DollGenPage.staticSearchFqId(siteRequest_, o);
		case "pageUriDoll":
			return DollGenPage.staticSearchFqPageUriDoll(siteRequest_, o);
			default:
				return BaseResultPage.staticSearchFqBaseResultPage(entityVar,  siteRequest_, o);
		}
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		return sb.toString();
	}

	public static final String CLASS_SIMPLE_NAME = "DollGenPage";
	public static final String VAR_searchListDoll_ = "searchListDoll_";
	public static final String VAR_listDoll = "listDoll";
	public static final String VAR_dollCount = "dollCount";
	public static final String VAR_doll_ = "doll_";
	public static final String VAR_id = "id";
	public static final String VAR_pageUriDoll = "pageUriDoll";

	public static final String DISPLAY_NAME_searchListDoll_ = "";
	public static final String DISPLAY_NAME_listDoll = "";
	public static final String DISPLAY_NAME_dollCount = "";
	public static final String DISPLAY_NAME_doll_ = "";
	public static final String DISPLAY_NAME_id = "";
	public static final String DISPLAY_NAME_pageUriDoll = "";

	public static String displayNameForClass(String var) {
		return DollGenPage.displayNameDollGenPage(var);
	}
	public static String displayNameDollGenPage(String var) {
		switch(var) {
		case VAR_searchListDoll_:
			return DISPLAY_NAME_searchListDoll_;
		case VAR_listDoll:
			return DISPLAY_NAME_listDoll;
		case VAR_dollCount:
			return DISPLAY_NAME_dollCount;
		case VAR_doll_:
			return DISPLAY_NAME_doll_;
		case VAR_id:
			return DISPLAY_NAME_id;
		case VAR_pageUriDoll:
			return DISPLAY_NAME_pageUriDoll;
		default:
			return BaseResultPage.displayNameBaseResultPage(var);
		}
	}
}
