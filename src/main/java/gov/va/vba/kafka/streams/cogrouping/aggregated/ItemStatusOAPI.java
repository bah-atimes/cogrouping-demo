package gov.va.vba.kafka.streams.cogrouping.aggregated;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Objects;

/**
 * Object that describes a failed item&#39;s status
 */
@ApiModel(description = "Object that describes a failed item's status")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-04-16T11:26:38.173-04:00[America/New_York]")

public class ItemStatusOAPI  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("statusCode")
  private ItemStatusCodeOAPI statusCode = null;

  @JsonProperty("statusMessage")
  private String statusMessage;

  public ItemStatusOAPI id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ItemStatusOAPI statusCode(ItemStatusCodeOAPI statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * Get statusCode
   * @return statusCode
  */
  @ApiModelProperty(value = "")

  

  public ItemStatusCodeOAPI getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(ItemStatusCodeOAPI statusCode) {
    this.statusCode = statusCode;
  }

  public ItemStatusOAPI statusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Get statusMessage
   * @return statusMessage
  */
  @ApiModelProperty(value = "")


  public String getStatusMessage() {
    return statusMessage;
  }

  public void setStatusMessage(String statusMessage) {
    this.statusMessage = statusMessage;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemStatusOAPI itemStatusOAPI = (ItemStatusOAPI) o;
    return Objects.equals(this.id, itemStatusOAPI.id) &&
        Objects.equals(this.statusCode, itemStatusOAPI.statusCode) &&
        Objects.equals(this.statusMessage, itemStatusOAPI.statusMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, statusCode, statusMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemStatusOAPI {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    statusMessage: ").append(toIndentedString(statusMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

